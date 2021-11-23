from flask import Flask, request
from flask_restx import Resource, Api, Namespace, fields, reqparse

import json
import logging

app = Flask(__name__)
api = Api(app)


@api.route('/test')
class Test(Resource):

    def get(self):
        response = {}
        response['healthcheck'] = 'available'
        response['flask'] = 'flask'
        return response


if __name__ == '__main__':
    app.run(debug=True, port=5000)
