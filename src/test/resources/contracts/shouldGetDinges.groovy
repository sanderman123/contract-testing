package contracts

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/api/dinges'
    }
    response {
        status 200
        body("""mocked dinges""")
    }
}