# recipe to build GLES gfxdriver

FILESPATHPKG =. "qt4-embedded-${PV}:qt4-embedded:"

QT_CONFIG_FLAGS += "-D QT_QWS_CLIENTBLIT -depths 16,24,32 -opengl es1 -plugin-gfx-powervr"

require qt4-embedded_${PV}.bb

DEPENDS += "virtual/egl"
SRC_URI += "file://sgx-hack.patch;patch=1"

export EXTRA_QMAKE_MUNGE = " glmunge "

CXXFLAGS_append = " -I${S}/src/3rdparty/powervr/"
CFLAGS_append = " -I${S}/src/3rdparty/powervr/"


glmunge() {
sed -e /QMAKE_INCDIR_OPENGL/d -e /QMAKE_LIBDIR_OPENGL/d -e /QMAKE_LIBS_OPENGL/d -e /QMAKE_LIBS_OPENGL_QT/d -i mkspecs/${OE_QMAKE_PLATFORM}/qmake.conf
echo "QMAKE_INCDIR_OPENGL = ${STAGING_INCDIR}/GLES/" >> mkspecs/${OE_QMAKE_PLATFORM}/qmake.conf
echo "QMAKE_LIBDIR_OPENGL  = ${STAGING_LIBDIR}" >> mkspecs/${OE_QMAKE_PLATFORM}/qmake.conf
echo "QMAKE_LIBS_OPENGL = -lEGL -lGLES_CM -lIMGegl -lsrv_um" >> mkspecs/${OE_QMAKE_PLATFORM}/qmake.conf
echo "QMAKE_LIBS_OPENGL_QT = -lEGL -lGLES_CM -lIMGegl -lsrv_um" >> mkspecs/${OE_QMAKE_PLATFORM}/qmake.conf
}


