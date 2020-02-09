SUMMARY = "Packages installed in the standard dbox runtime"
PR = "r1"

inherit packagegroup

RDEPENDS_${PN} = "\
  dbox-app-service \
"
