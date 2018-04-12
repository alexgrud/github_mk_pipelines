common = new com.mirantis.mk.Common()
node{
	def venv
	def venvPepper
	def outputs = [:]
	def workspace = common.getWorkspace()
        venv = "${workspace}/venv"
        venvPepper = "${workspace}/venvPepper"
	println("Test message")
	println(venvPepper)
	saltMasterHost="172.17.49.168"
	SALT_MASTER_URL = "http://${saltMasterHost}:6969"
	println(SALT_MASTER_URL)

}
