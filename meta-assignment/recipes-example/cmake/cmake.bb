DESCRIPTION="writing .bb for cmake"
LICENSE="CLOSED"
SRC_URI="file://main.c \
	file://calc.c \
	file://calc.h \
	file://CMakeLists.txt "
S="${WORKDIR}"
do_compile(){
	cd ${S}
	mkdir -p build
	cd build
	cmake ..
	make
}
do_install(){
	install -d ${D}/usr/bin
	install -m 777 ${S}/build/helloworld ${D}/usr/bin
}
