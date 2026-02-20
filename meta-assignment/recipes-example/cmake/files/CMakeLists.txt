Cmake_minimum_required(VERSION 3.10)
project(makefile C)
set(CMAKE_C_STANDARD 99)
add_executable(helloworld main.c calc.c calc.h)
