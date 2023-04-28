package Homework5.Core.Infrastructure;

import Homework5.Core.Infrastructure.ExpFormat;
import Homework5.Core.Models.Contact;

public class ExportToCSV implements ExpFormat {
    @Override
    public <C extends Contact> String createString(C contact) {
        return String.format("%s|%s|%s|%s\n",contact.getFirstName(), contact.getLastName(), contact.getPhones(), contact.getDescription());
    }
}
