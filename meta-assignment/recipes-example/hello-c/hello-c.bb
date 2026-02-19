DESCRIPTION="receipe for hello-c .bb file"

LICENSE="CLOSED"

SRC_URI="file://hello-c.c"

S="${WORKDIR}"

do_compile(){
	cd ${S}
	${CC} ${LDFLAGS} hello-c.c -o hello-c
}

do_install(){
	install -d ${D}/usr/bin
	install -m 777 ${S}/hello-c ${D}/usr/bin
}
