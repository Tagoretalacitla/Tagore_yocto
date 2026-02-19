DESCRIPTION="receipe for libmodbus_3.1.6"

LICENSE="GPLv2.1"

LIC_FILES_CHKSUM="file://COPYING.LESSER;md5=4fbd65380cdd255951079008b364516c"

SRC_URI="git://github.com/stephane/libmodbus.git;protocol=https"

SRCREV="f9fe3b0a5343f7fbb3f5c74196bd0fce88df39d5"

S="${WORKDIR}/git"

inherit autotools
