#
# General Java makefile
# scoutchorton, 2020
#

#
# General project details
#

#Name of project
NAME = SwingTest








#
# Variables
#

ifeq (${MAKELEVEL}, 0)
export PROJDIR = ${shell pwd}
endif
SUBDIRS = ${wildcard */}
SRC = ${wildcard *.java}
CLASSES = ${SRC:.java=.class}
DOCS = ./docs
PKGS = jti

#
# Recipies
#

.PHONY: ${SUBDIRS}
.PHONY: documentation

#Descending into subdirectories
subdirs: ${CLASSES} ${SUBDIRS}

${SUBDIRS}:
	@${MAKE} ${MAKECMDGOALS} -C $@ -f ${PROJDIR}/makefile

#Compile Java source files
%.class: %.java
	javac $<

#Clean project from class files
clean: ${SUBDIRS}
ifneq "${wildcard *.class}" ""
	rm ${foreach file,${wildcard *.class},'${file}'}
endif

#Documentation
docs:
	@mkdir docs

documentation: docs
	javadoc -d ${DOCS} ${PKGS}