from django.shortcuts import render

# Create your views here.
def homepage(request):
    return render(request, 'index.html')  # Renders the homepage template

def track_expense(request):
    return render(request, 'track_expense.html')