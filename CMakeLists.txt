cmake_minimum_required(VERSION 3.10)
project(STSS)
set(CMAKE_CXX_STANDARD 17)
include_directories(include)
add_executable(stss
    src/main.cpp
    src/Task.cpp
    src/Utils.cpp
    src/TaskScheduler.cpp
)
