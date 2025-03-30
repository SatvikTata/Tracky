from django.urls import path
from . import views

urlpatterns = [
    path('', views.homepage, name='homepage'),  # Homepage URL
    path('track-expense/', views.track_expense,name='track_expense'),
]