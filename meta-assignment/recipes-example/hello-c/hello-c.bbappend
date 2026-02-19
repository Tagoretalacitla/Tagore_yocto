FILESEXTRAPATHS:prepend := "${THISDIR}/files/:"

SRC_URI:append = " file://hello_cpp.cpp"

do_compile:append(){
	${CXX} ${LDFLAGS} hello_cpp.cpp -o hello_cpp
}
do_install:append(){
	install -m 777 ${S}/hello_cpp ${D}/usr/bin
}

PACKAGES += "hello-cpp"

FILES_hello-cpp = "usr/bin/hello_cpp"
