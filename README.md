# Liferay Portlet Minimal Working Example

This project is an attempt to create minimal working example (MWE) of a liferay portlet, e.g. portlet made with as little code as possible.

* Java version: 1.7
* Liferay version: liferay-portal-6.1.2-ce-ga3
* Faces version: 3.1.1-ga2
* Spring version: 3.1.2.RELEASE

### Some background

Liferay portlet (this project) is a small component which can be added into portal.
It can create various elements - but for simplicity, in this project it creates list from 'one' to 'ten'.
The whole project is packed into a war file, which is then used for deploying portlet onto portal, in this case liferay portal.
To make this work, you just need to run 'mvn package' and take the created '.war' file from 'target' folder and paste it into 'deploy' liferay folder (while liferay is running).
