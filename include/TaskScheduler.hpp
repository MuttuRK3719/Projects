#ifndef TASK_SCHEDULER_HPP
#define TASK_SCHEDULER_HPP

#include "Task.hpp"
#include "Command.hpp"
#include <unordered_map>
#include <queue>
#include <stack>
#include <list>
#include <set>
#include <deque>

class TaskScheduler {
public:
    TaskScheduler();
    bool addTask(int id, const std::string &name, int pr);
    bool executeNextTask();
    bool deleteTask(int id);
    bool undo();
    bool redo();
    void showRecent();
    void printAll();
    void showLogs(int lastN=20);
    void showPendingPriorityList();
    void inspectTask(int id);
};
#endif
