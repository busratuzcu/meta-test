SUMMARY = "A simple Hello World application"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://hello_world.c;md5=b75edb6eecaf434cc55a81d5a502bfb8"
SRC_URI = "file://hello_world.c"

TARGET_CC_ARCH += "${LDFLAGS}"

S = "${WORKDIR}"

do_compile() {
  ${CC} -Wall hello_world.c -o hello-world
}

do_install() {
  install -d ${D}${bindir}
  install -m 0755 ${S}/hello-world ${D}${bindir}
}
