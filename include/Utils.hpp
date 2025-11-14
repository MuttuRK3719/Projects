#ifndef UTILS_HPP
#define UTILS_HPP
#include <string>
using TimePoint = long long;
TimePoint now_timestamp();
std::string time_readable(TimePoint t);
#endif
