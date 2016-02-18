from django.shortcuts import render
from django.http import HttpResponseRedirect
from models import Users
from django.core.urlresolvers import reverse

import requests


def getData(userId):
    b = requests.get('https://api.instagram.com/v1/users/{}/media/recent?access_token=1497402817.1fb234f.1b8969bb3b304945a6782ae574069017'.format(userId))

    return b.json()


def search(request):
    return render(request, 'photos/search.html')

def check(request):

    searchInput = request.POST.get('searchInput')
    if searchInput is not '':
        users = Users.objects.filter(username=searchInput)

        if len(users) > 0:

            user_id = users[0].userId # is working
            return HttpResponseRedirect(reverse('photos:view1', kwargs={'userId': user_id}))
        else:
            r = requests.get('https://api.instagram.com/v1/users/search?access_token=1497402817.1fb234f.1b8969bb3b304945a6782ae574069017&q={}'.format(searchInput))
            response = r.json()

            for user in response['data']:
                if user['username'] == searchInput and len(user['username']) == len(searchInput):
                    userId = user['id']
                    username = user['username']

                    newUser = Users(userId = userId, username=username)
                    newUser.save()

                    return HttpResponseRedirect(reverse('photos:view1', kwargs={'userId': userId}))

    return render(request, 'photos/search.html', {
        'error_message': "Please input a valid username.",
    })


def view1(request, userId):
    queryResult = getData(userId)

    return render(request, 'photos/template1.html', {'pics_list': queryResult, 'userId': userId})


def view2(request, userId):
    queryResult = getData(userId)

    return render(request, 'photos/template2.html', {'pics_list': queryResult, 'userId': userId})


def view3(request, userId):
    queryResult = getData(userId)

    return render(request, 'photos/template3.html', {'pics_list': queryResult, 'userId': userId})


def view4(request, userId):
    queryResult = getData(userId)

    return render(request, 'photos/template4.html', {'pics_list': queryResult, 'userId': userId})


def view5(request, userId):
    queryResult = getData(userId)

    return render(request, 'photos/template5.html', {'pics_list': queryResult, 'userId': userId})