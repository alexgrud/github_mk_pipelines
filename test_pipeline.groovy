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
}
