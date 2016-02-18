from __future__ import unicode_literals
from django.db import models
from django.utils.encoding import python_2_unicode_compatible

@python_2_unicode_compatible
class Users(models.Model):
    userId = models.IntegerField()
    username = models.CharField(max_length=30)

    def __str__(self):
        return self.username