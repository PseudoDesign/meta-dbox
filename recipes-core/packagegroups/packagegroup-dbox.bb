SUMMARY = "Packages installed in the standard dbox runtime"
PR = "r1"

inherit packagegroup

RDEPENDS_${PN} = "\
  python3 \
  python3-rpi-gpio \
  python3-pyyaml \
  python3-bcrypt \
  python3-transitions \
  python3-colorzero \
  python3-gpiozero \
"
