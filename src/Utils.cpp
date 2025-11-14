#include "Utils.hpp"
#include <chrono>
#include <ctime>

TimePoint now_timestamp() {
    return std::chrono::duration_cast<std::chrono::seconds>(
               std::chrono::system_clock::now().time_since_epoch())
        .count();
}

std::string time_readable(TimePoint t) {
    time_t tt = (time_t)t;
    tm *gmt = localtime(&tt);
    char buf[64];
    strftime(buf, sizeof(buf), "%Y-%m-%d %H:%M:%S", gmt);
    return std::string(buf);
}
