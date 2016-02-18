from django.conf.urls import url
from . import views

app_name = 'photos'
urlpatterns = [
    url(r'^$', views.search, name='search'),
    url(r'^check_user/$', views.check, name='check'),
    url(r'^(?P<userId>[0-9]+)/template1/$', views.view1, name='view1'),
    url(r'^(?P<userId>[0-9]+)/template2/$', views.view2, name='view2'),
    url(r'^(?P<userId>[0-9]+)/template3/$', views.view3, name='view3'),
    url(r'^(?P<userId>[0-9]+)/template4/$', views.view4, name='view4'),
    url(r'^(?P<userId>[0-9]+)/template5/$', views.view5, name='view5'),
]

