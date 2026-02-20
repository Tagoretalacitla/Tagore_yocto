DESCRIPTION = "Basic .bbfile for aws-c-common"
LICENSE = "GPLv0.3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "git://github.com/awslabs/aws-c-common.git;branch=main"
SRCREV = "67262a9a458585400187417d49c39c737507f671"

S = "${WORKDIR}/git"

inherit cmake
