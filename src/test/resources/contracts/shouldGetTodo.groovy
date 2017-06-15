package contracts

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/api/todo'
    }
    response {
        status 200
        body("""
            {
                "title": "hallo",
                "done": false
            }
        """)
    }
}