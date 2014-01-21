greaterThan(QT_MAJOR_VERSION, 4):QT += widgets webkitwidgets
CONFIG += c++11

# Add more folders to ship with the application, here

# Define TOUCH_OPTIMIZED_NAVIGATION for touch optimization and flicking
#DEFINES += TOUCH_OPTIMIZED_NAVIGATION

# If your application uses the Qt Mobility libraries, uncomment the following
# lines and add the respective components to the MOBILITY variable.
# CONFIG += mobility
# MOBILITY +=

# The .cpp file which was generated for your project. Feel free to hack it.
SOURCES += main.cpp \
    weblobbywindow.cpp \
    lobbyinterface.cpp \
    networkhandler.cpp

LIBS += -lboost_filesystem -lboost_system -lboost_thread

# Please do not modify the following two lines. Required for deployment.
include(html5applicationviewer/html5applicationviewer.pri)
qtcAddDeployment()

HEADERS += \
    weblobbywindow.h \
    lobbyinterface.h \
    logger.h
