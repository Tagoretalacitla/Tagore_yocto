DESCRIPTION="writing .bb file for autoconf"
LICENSE="CLOSED"
SRC_URI="file://main.c \
        file://configure.ac \
        file://Makefile.am "
S="${WORKDIR}"
do_compile(){
        cd ${S}
        ./autoreconf --install
        ./configure --host=poky-linux-gnueabi
        make
}
do_install(){
        install -d ${D}/usr/bin
        install -m 777 ${S}/helloautoconf ${D}/usr/bin
}
