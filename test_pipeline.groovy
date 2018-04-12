common = new com.mirantis.mk.Common()
def venv
def venvPepper
def outputs = [:]
node{
	stage ("Preparing data") {
	def workspace = common.getWorkspace()
        venv = "${workspace}/venv"
        venvPepper = "${workspace}/venvPepper"
	println("Test message")
	println(venvPepper)
	saltMasterHost="172.17.49.168"
	SALT_MASTER_URL = "http://${saltMasterHost}:6969"
	println(SALT_MASTER_URL)
	}
}
