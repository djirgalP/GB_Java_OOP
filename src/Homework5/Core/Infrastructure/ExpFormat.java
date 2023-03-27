package Homework5.Core.Infrastructure;

import Homework5.Core.Models.Contact;

public interface ExpFormat {
    <C extends Contact> String createString(C contact);
}
