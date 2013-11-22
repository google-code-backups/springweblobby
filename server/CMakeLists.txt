cmake_minimum_required(VERSION 2.6)
project(SwlServer)

if(CMAKE_COMPILER_IS_GNUCXX)
    set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11 -Wall -pthread")
endif()

add_executable(weblobby-server src/main.cpp)

include_directories("${SwlServer_SOURCE_DIR}/include")

set(Boost_USE_STATIC_LIBS ON)
set(Boost_USE_MULTITHREADED ON)
find_package(Boost 1.36.0 REQUIRED COMPONENTS system)
if(Boost_FOUND)
    include_directories(${Boost_INCLUDE_DIRS})
    target_link_libraries(weblobby-server ${Boost_LIBRARIES})
endif()
