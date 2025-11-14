#ifndef TASK_HPP
#define TASK_HPP
#include <string>
using TimePoint = long long;

enum class TaskStatus { PENDING, EXECUTED, DELETED };

struct Task {
    int id;
    std::string name;
    int priority;
    TimePoint createdAt;
    TimePoint executedAt;
    TaskStatus status;

    Task() = default;
    Task(int i, std::string n, int p);
};
#endif
