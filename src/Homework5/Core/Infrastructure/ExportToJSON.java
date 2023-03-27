package Homework5.Core.Infrastructure;

import Homework5.Core.Infrastructure.ExpFormat;
import Homework5.Core.Models.Contact;

public class ExportToJSON implements ExpFormat {
    @Override
    public <C extends Contact> String createString(C contact) {
        return String.format("""
                {
                "FirstName":%s,
                "LastName":%s,
                "Phone":%s,
                "Description":%s,
                }
                """, contact.getFirstName(), contact.getLastName(), contact.getPhone(), contact.getDescription());
    }
}