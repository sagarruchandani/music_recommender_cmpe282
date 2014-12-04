class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller:"Home",action:"homepage")
		"/cmpe282/userlogin"(view:"/userlogin/login")
        "500"(view:'/error')
	}
}
