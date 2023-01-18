# POC - Convert OpenApi.yaml to Path List

Proof of concept to convert an OpenApi.ymal to a List of Paths with the existing methods.

The objetive is use this list by QA team to have de % of endpoints covered by automatic tests.

Get a method list:

```
/api/customers/{customer-id}#get
/api/customers/{customer-id}#put
/api/customers#post
/api/persons/{customer-id}#get
/api/persons#post
```

From any openApi.yaml

```
openapi: "3.0.0"
info:
  title: Simple API overview
  version: 2.0.0
paths:
  /api/customers/{customer-id}:
    get:
      summary: Returns a user by ID.
      parameters:
        - in: path
          name: userId
          required: true
          schema:
            type: integer
            format: int64
            minimum: 1
      responses:
        '200':
          description: OK
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/User'    # <-------
    put:
      summary: Returns a user by ID.
      parameters:
        - in: path
          name: userId
          required: true
          schema:
            type: integer
            format: int64
            minimum: 1
      responses:
        '200':
          description: OK
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/User'    # <-------
  /api/customers:
    post:
      summary: Creates a new user.
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/User'      # <-------
      responses:
        '201':
          description: Created
  /api/persons/{customer-id}:
    get:
      summary: Returns a user by ID.
      parameters:
        - in: path
          name: userId
          required: true
          schema:
            type: integer
            format: int64
            minimum: 1
      responses:
        '200':
          description: OK
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/User'    # <-------
  /api/persons:
    post:
      summary: Creates a new user.
      requestBody:
        required: true
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/User'      # <-------
      responses:
        '201':
          description: Created
```

