DESCRIPTION="receipe for libmodbus_3.1.5"

LICENSE="GPLv2.1"

LIC_FILES_CHKSUM="file://COPYING.LESSER;md5=4fbd65380cdd255951079008b364516c"

SRC_URI="git://github.com/stephane/libmodbus.git;protocol=https"

SRCREV="890e689b9e6a806e26d7072e142cf2b3bda62755"

S="${WORKDIR}/git"


inherit autotools
