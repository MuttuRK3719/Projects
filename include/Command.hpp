#ifndef COMMAND_HPP
#define COMMAND_HPP
#include <string>
#include "Task.hpp"
struct Command {
    std::string type;
    Task snapshot;
};
#endif
