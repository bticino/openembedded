DESCRIPTION = "Console Application"
SECTION = "opie/applications"
PRIORITY = "optional"
LICENSE = "GPL"
DEPENDS = "opie-keytabs"
RDEPENDS = "opie-keytabs"
APPNAME = "opie-console"
APPTYPE = "binary"

S = "${WORKDIR}/${APPNAME}"

inherit opie

do_install() {
	install -d ${D}${palmtopdir}/pics/console/keys/
	install -m 0644 ${WORKDIR}/pics/inline/pass.* ${D}${palmtopdir}/pics/
	install -m 0644 ${WORKDIR}/pics/console/*.png ${D}${palmtopdir}/pics/console/
	install -m 0644 ${WORKDIR}/pics/console/keys/*.png ${D}${palmtopdir}/pics/console/keys/
}
