DESCRIPTION="writing .bb for hellocpp"
LICENSE="CLOSED"
SRC_URI="file://hellocpp.cpp"
S="${WORKDIR}"
do_compile(){
	cd ${S}
	${CXX} ${LDFLAGS} hellocpp.cpp -o Hello1

}
do_install(){
	install -d ${D}/usr/bin
	install -m 777 ${S}/Hello1 ${D}/usr/bin

}
