from django.shortcuts import render
from rest_framework.response import Response
from rest_framework.decorators import api_view

# Create your views here.

@api_view(['GET'])
def home_data(request):
    return Response({
        "message": "Welcome to Tracky!",
        "features": [
            {"name": "Track Expenses", "url": "/track-expense"},
            {"name": "Track Net Worth", "url": "/track-networth"}
        ]
    })