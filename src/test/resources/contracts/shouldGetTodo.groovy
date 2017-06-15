package contracts

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/todo'
    }
    response {
        status 200
        body("""
            {
                "title": "hallo aap",
                "done": false
            }
        """)
    }
}