#include "Task.hpp"
#include <utility>
#include <chrono>

Task::Task(int i, std::string n, int p)
    : id(i), name(std::move(n)), priority(p),
      createdAt(std::chrono::duration_cast<std::chrono::seconds>(
          std::chrono::system_clock::now().time_since_epoch()).count()),
      executedAt(0),
      status(TaskStatus::PENDING) {}
