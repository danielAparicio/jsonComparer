package jsonComparer

import org.json4s._
import org.json4s.native.JsonMethods._

object jsonComparerData {

  val jsonA1 = parse("""{
    "prop-only-a" : "val1",
    "common" : "val common"
	}""")
  val jsonA2 = parse("""{
    "prop-only-a" : {
		"nested-only-a": "a"
	},
    "almost-common" : {
		"val common" : "common",
		"val a" : "a"
	}
	}""")

  val jsonA3 = parse("""{
  "apiDateFormat": "YYYYMMDD",
  "uiDateFormat": "DD-MMM-YYYY",
  "GBP": "&#163;",
  "USD": "&#36;",
  "EUR": "&#128;",
  "common": {
    "home": "Home",
    "undo": "Undo",
    "on": "on",
    "close": "Close",
    "select": "Select",
    "previous": "Previous",
    "next": "Next",
    "room": "Room",
    "nights": "Nights",
    "hide": "Hide",
    "show": "Show",
    "with": "with",
    "allResults": "all Results",
    "providedBy": "Provided by",
    "providedByFull": "This Holiday is provided by",
    "error": "There was a problem",
    "notFound": "We are really sorry but the page you requested cannot be found. Please check the request and try again.",
    "generic_error": "We are sorry but we could not process your request because of a system error. Please try again after sometime. If you still experience problems, please call 0844 879 8444 (Mon – Sun: 8am – 10pm)",
    "title": "Title",
    "numbers": [
      "first",
      "second",
      "third",
      "fourth",
      "fifth",
      "sixth",
      "seventh",
      "eighth",
      "ninth"
    ],
    "date": {
      "day": "Date",
      "month": "Month",
      "year": "Year"
    },
    "titles": [
      {
        "name": "Mr",
        "value": "MR"
      },
      {
        "name": "Mrs",
        "value": "MRS"
      },
      {
        "name": "Ms",
        "value": "MS"
      },
      {
        "name": "Miss",
        "value": "MISS"
      }
    ],
    "childTitles": [
      {
        "name": "Master",
        "value": "MR"
      },
      {
        "name": "Miss",
        "value": "MISS"
      }
    ],
    "months": [
      {
        "name": "January",
        "value": 1
      },
      {
        "name": "February",
        "value": 2
      },
      {
        "name": "March",
        "value": 3
      },
      {
        "name": "April",
        "value": 4
      },
      {
        "name": "May",
        "value": 5
      },
      {
        "name": "June",
        "value": 6
      },
      {
        "name": "July",
        "value": 7
      },
      {
        "name": "August",
        "value": 8
      },
      {
        "name": "September",
        "value": 9
      },
      {
        "name": "October",
        "value": 10
      },
      {
        "name": "November",
        "value": 11
      },
      {
        "name": "December",
        "value": 12
      }
    ]
  },
  "search": {
    "updatingYourResults": "Updating your results",
    "holidaysFound": "holidays found",
    "seoHolidaysFound": "{0} holidays found",
    "whatsIncludedFooter": "There is no fee if you pay by debit card. A 2% fee (up to a maximum of £95) will be charged if you pay by credit card",
    "bar": {
      "anyDestination": "Any destination",
      "anyAirport": "Any Airport",
      "whereTo": "Where To ?",
      "fromWhere": "From where ?",
      "whenAndHowLong": "When and how long ?",
      "with": "With ?",
      "when": "When ?",
      "iAmFlexible": "I'm flexible +/- 3 days",
      "howLongFor": "How long for ?",
      "apply": "Apply",
      "search": "Search",
      "edit": "Edit",
      "addAnotherRoom": "Add another room",
      "removeARoom": "Remove a room"
    },
    "filters": {
      "basicFilters": "Basic Filters",
      "sortByRelevance": "Sort by relevance",
      "list": "List",
      "map": "Map",
      "viewOnMap": "View on map",
      "filter": "Filters",
      "refineYourSearch": "Refine your Search"
    },
    "errors": {
      "pleaseSpecifyChildAge": "Please specify child age",
      "moreThan9Guests": "Booking for more than 9 people ?",
      "callUs": "Please call 0844 879 8493 to speak to one our advisors who will help you with your holiday needs.",
      "moreInfantsThanAdults": "More infants than adults ?",
      "contactUs": "If you still experience problems, please call 0844 879 8444 (Mon – Sun: 8am – 10pm)",
      "suggestion": {
        "airport": [
          "Sorry, we can't find your airport",
          "Please choose a different airport, or ensure your selection is spelt correctly."
        ],
        "destination": [
          "Sorry, we can't find your destination",
          "Please choose a different destination, or ensure your selection is spelt correctly."
        ],
        "airportTitle": "Sorry, we can't find your airport",
        "airportMessage": "Please choose a different airport, or ensure your selection is spelt correctly.",
        "destinationTitle": "Sorry, we can't find your destination",
        "destinationMessage": "Please choose a different destination, or ensure your selection is spelt correctly."
      },
      "results": {
        "500": [
          "We're sorry, we did not receive a response from our system, please try searching for your holiday again in a few minutes.",
          "If you still experience problems, please call 0844 879 8444 (Mon – Sun: 8am – 10pm)"
        ],
        "1008": [
          "1008",
          "Sorry, there are currently no holidays available that meet your search criteria. Please change your departure date and/or duration options, or change your star rating and/or board basis options.",
          "Your holiday may not be available on the dates you are searching, view more dates to see our popular holiday destinations.",
          "Alternatively, for flexible departure airports and flight durations, please visit our flight + hotel page.",
          "If you still experience problems, please call 01733 224 800 (Mon – Sun: 8am – 10pm) to speak to a travel advisor. [Error Code: 1008]"
        ]
      }
    },
    "flightSeats": {
      "hurryNote": "{0}Hurry{1}&nbsp;only {2} seat(s) left!",
      "availability": "Only {0} seat(s) left!",
      "lastAvailability": "Last flight seat availability check was at 09:00 am on {0}",
      "notice": "<h5>Notice</h5><p>You may be able to choose other seats from the accommodation page, but the cost of it may be higher. We may occasionally put some seats on sale at the later date.</p><p>This shows how many seats are available for this holiday at this moment.</p>"
    },
    "rooms": {
      "hurryNote": "{0}Hurry{1}&nbsp;only {2} room(s) left!",
      "availability": "Only {0} room(s) left!",
      "lastAvailability": "Last room availability check was at 09:00 am on {0}",
      "notice": "<h5>Notice</h5><p>You may be able to choose other room types from the accommodation page, but the cost of it may be higher. We may occasionally add more of the same room types on sale at a later date.</p>"
    }
  },
  "accom": {
    "bookNow": "Book Now",
    "rooms": "Rooms",
    "flight": "Flight",
    "facilities": "Facilities",
    "reviews": "Reviews",
    "askNAnswers": "Ask & Answers",
    "hotelHighlights": "Hotel highlights",
    "video": "Video",
    "benefits": "Benefits",
    "yourHotelRoom": "Your hotel room",
    "boardBasis": "Board Basis",
    "only": "Only",
    "roomsLeft": "rooms left!",
    "maxAdults": "Max adults",
    "select": "Select",
    "yourCurrentRoom": "Your current room",
    "yourHotel": "Your Hotel",
    "roomInfo": "Room Info",
    "noSupportForVideo": "Your browser does not support the video tag.",
    "yourFlight": "Your flight",
    "duration": "Duration",
    "priceForWholeParty": "Prices shown are total for the whole party",
    "flightDetails": "Flight details",
    "totalPriceWas": "Total price was",
    "SavingToday": "Saving today",
    "totalPriceFrom": "Total price from",
    "totalPrice": "Total price",
    "cardFeeApplies": "A 2% fee (up to a maximum of £95) will be charged if you pay by credit card",
    "noDebitCardCharges": "No debit card charges",
    "balcony": "balcony",
    "priceCorrectAsOf": "Price correct as of",
    "selectAndClose": "Select & Close",
    "close": "Close",
    "noDebitCharges": "No debit card charges",
    "2PercentFee": "A 2% fee (up to a maximum of £95) will be charged if you pay by credit card",
    "priceCorrect": "Price correct as of ",
    "9am": "09:00 am on",
    "currentChoice": "Current choice",
    "inboundWith": "Inbound with",
    "outboundWith": "Outbound with",
    "selected": "Selected",
    "cheapest": "Cheapest",
    "totalPrices": "Prices shown are total for the whole party",
    "fromTripAdvisor": "From TripAdvisor",
    "fromOurCustomers": "From our customers",
    "noDataForDatesInPriceList": "Error we don't have a match in our data for dates in the price list",
    "reviewsTitle": "Thomas Cook reviews"
  },
  "checkout": {
    "errors": {
      "default": "Something went wrong. Please try again. (Error Code: {0})"
    },
    "progressBar": {
      "step1Long": "Your holiday",
      "step2Long": "Holiday essentials",
      "step3Long": "Passenger details",
      "step4Long": "Payment",
      "step5Long": "Done",
      "step1Short": "Holiday",
      "step2Short": "Essentials",
      "step3Short": "Passengers",
      "step4Short": "Payment",
      "step5Short": "Done"
    },
    "payment": {
      "checkDetailsAndPay": "Check your details and pay",
      "paymentQuestion": "How would you like to pay?",
      "oneLastStep": "One last step, you are nearly done",
      "holidayTotal": "Holiday total",
      "deposit": "Deposit",
      "cardFee": "Card fee",
      "secureToday": "Secure today for",
      "remDeposit": "Remaining deposit",
      "remBalance": "Remaining balance",
      "totalBalance": "Total balance owed",
      "flightAccomNotice": "Please read the latest&nbsp;<a class='link' id='errataFlightAccomLink' data-toggle='modal' data-target='#errataFlightAccomModal'>flight/accommodation updates</a>&nbsp;for this holiday before proceeding",
      "bookCondition": {
        "line1": "I accept it is my responsibility to read and understand the",
        "link": "Booking Conditions & Holiday Information",
        "line2": "of the Tour Operator."
      },
      "ourGuide": {
        "line1": "All members of your party must satisfy the entry requirements for the country you are travelling to. Visit the FCO Travel Advice website or view",
        "link": "our guide",
        "line2": "to passport/visa/health information."
      },
      "toPaytoday": "To pay today",
      "confirmPay": "Confirm and pay",
      "dueMessage": "(due {0})",
      "validationErrors": {
        "tAndC": "You must check to accept the Terms and Conditions"
      },
      "acceptedCards": "We accept these cards:",
      "customerAssurance": "You are in good hands",
      "creditCardFeeMessage": "There is no fee if you pay by debit card. A 2% fee (up to a maximum of &pound;95) will be charged if you pay by credit card.",
      "promocode": "Promo code",
      "cardInfo": "Enter your card information",
      "mandatoryInfo": "All fields marked <span class=\"glyphicon glyphicon-asterisk\"></span> must be completed",
      "cardtype": "Card type",
      "selectCardType": "Select a card type",
      "cardNumber": "Card number",
      "cardHoldersName": "Name on card",
      "expiryDate": "Expiration date",
      "securityCode": "Card security code",
      "error": {
        "cardtype": "The number you've entered doesn't match your chosen card type. Please try again or choose another card type.",
        "cardNumber": "The number you've entered is invalid. Please check and try again.",
        "cardNumberIncomplete": "The number you've entered is incomplete or invalid. Please check and try again.",
        "expiryDate": "The expiry date you've selected is invalid. Please check and try again.",
        "expiryMonth": "The expiry month is empty, please review and amend",
        "expiryYear": "The expiry year is empty, please review and amend",
        "cardHoldersName": "The name on card is empty or invalid, please review and amend",
        "securityCode": "The Card Security Code you've entered is invalid. Please check and try again",
        "securityCodeIncomplete": "The security number is incomplete or invalid, please review and amend"
      },
      "room": "Room",
      "contactDetails": {
        "title": "Contact Details",
        "name": "Name",
        "email": "Email",
        "phone": "Phone",
        "address": "Address"
      }
    },
    "processPayment": {
      "header": "You're nearly there",
      "paymentInstructions": "Your bank is carrying out additional authentication checks to secure your payment. They may request additional information to ensure that the payment is valid and being requested by you, the cardholder. Please do not close your browser or click back whilst this takes place. You may wish to contact your bank if you have any queries."
    },
    "paymentType": {
      "lowDepositTitle": "Low Deposit",
      "standardDepositTitle": "Standard Deposit",
      "payFullTitle": "Pay in Full",
      "lowDepositBlurb": "Pay <strong>{0}</strong>  deposit now. The remaining <strong>{1}</strong> deposit balance is due {2}. The remaining balance of <strong>{3}</strong> is due {4}. Click <a href='http://www.thomascook.com/pricing-terms-conditions' target='_blank'>here</a> for the low deposit terms & conditions.",
      "lowDepositBlurb1": "Pay <strong>{0}</strong>  deposit now. The remaining <strong>{1}</strong> deposit balance is due {2}. The remaining balance of <strong>{3}</strong> is due {4}.",
      "lowDepositBlurb2": "Click <a href='http://www.thomascook.com/pricing-terms-conditions' target='_blank'>here</a> for the low deposit terms & conditions.",
      "standardDepositBlurb": "Pay <strong>{0}</strong> deposit now. The remaining balance of <strong>{1}</strong> is due {2}.",
      "payFullBlurb": "Pay the full amount now and look forward to your holiday worry-free.",
      "cardFee": "Please note a {0}% fee (maximum charge £95) will be charged for this method of payment."
    },
    "pax": {
      "paxDetails": "Passenger Details"
    }
  },
  "basket": {
    "errors": {
      "ETIMEDOUT": "There was an error contacting the booking system. Please try submitting this request again.",
      "ECONNREFUSED": "There was an error contacting the booking system. Please try again later.",
      "TOSCA_AVAIL_RS_ERROR": "This holiday package is sold out. Please try another holiday package.",
      "COST_RS_ERROR": "There was an error getting current price for this holiday package. Please try again later.",
      "RECOST_RS_ERROR": "There was an error getting current price for this holiday package. Please try again later.",
      "PAX_RS_ERROR": "There was an error processing this booking. Please check the inputs and submit again or try again later.",
      "ERROR_COST_RS": "There was an error getting current price for this holiday package. Please try again later.",
      "BOOK_HOLD_RS_ERROR": "There was an error processing this booking. Please try again later.",
      "BOOK_HOLD_RS_TOSCA_ERROR": "There was an error processing this booking. Please try again later.",
      "BOOK_HOLD_OR_COMMIT_RS_EXCEPTION_ERROR": "There was an error processing this booking. Please try again later.",
      "BOOK_COMMIT_RS_ERROR": "There was an error processing this booking. Please try again later.",
      "BOOK_COMMIT_RS_TOSCA_ERROR": "There was an error processing this booking. Please try again later.",
      "PH_CONTENT_RS_ERROR": "There was an error processing this booking. Please try again later.",
      "PH_SEARCH_RS_ERROR": "There was an error processing this booking. Please try again later.",
      "BOOK_COMMIT_RS_WEBRIO_ERROR": "There was an error processing this booking. Please try again later.",
      "BASKET_RS_ERROR": "There was an error processing this booking. Please try again later.",
      "TOSCA_EXTRA_RS_ERROR": "There was an error processing this booking. Please try again later.",
      "TOSCA_COST_RS_ERROR": "There was an error getting current price for this holiday package. Please try again later.",
      "MULTI_RECOST_RS_ERROR": "There was an error getting current price for this holiday package. Please try again later.",
      "DATACASH_RS_ERROR": "There was an error processing the payment. Please try again later.",
      "DATACASH_COMMIT_RS_ERROR": "There was an error processing the payment. Please try again later.",
      "DATACASH_CANCEL_RS_ERROR": "There was an error processing the payment. Please try again later.",
      "BOOK_COMMIT_RS_NURVIS_ERROR": "There was an error processing this booking. Please try again later.",
      "not_found": "We are sorry but your session has timed out. Please start again.",
      "generic": "There was an error contacting the booking system. Please check the inputs and try submitting this request again."
    }
  },
  "login": "Login",
  "signup": "Signup",
  "liveChat": "Live chat",
  "callUs": "Call us",
  "edit": "Edit",
  "complex": "Replace {0} this in the string, and this too: {1}",
  "pax": {
    "back": "Back to holiday essentials",
    "title": "Tell us who is travelling",
    "continue": "Continue",
    "required": "Required",
    "findAddress": "Find address",
    "manualAddress": "Or enter your address manually",
    "selectAddress": "Street Address",
    "selectAddressDefault": "Select Address",
    "dobLabel": "Date of birth",
    "otherPaxSection": "Enter other passenger details",
    "otherPax": "Other passenger details",
    "roomDetails": "Room details",
    "prompt": "Please enter the details of the {0} {1} staying in this room",
    "infantAge": "under 2 years old on return",
    "childAge": "{0} years old on return",
    "checkLeadPaxMsg": "Please check that all lead passenger details are correct before continuing.",
    "lead": {
      "details": "Lead passenger details",
      "title1": "Enter the details of the lead passenger, who will be responsible for all of your holiday arrangements, including any changes you may wish to make. They will also receive all travel documents and updates by email. ",
      "title2": "All fields marked <span class=\"glyphicon glyphicon-asterisk\"></span> must be completed.",
      "marketing": "Yes, I would like to use this e-mail address to receive promotional offers and emails from Thomas Cook companies. Your personal details will not be passed to any third parties, except where necessary to process your booking or enquiry. For more information, please see our",
      "policy": "Privacy Policy.",
      "existing": "This is your lead passenger",
      "check": "Change the lead passenger to this room",
      "room": "Room"
    },
    "dob": {
      "day": "Day",
      "month": "Month",
      "year": "Year"
    },
    "error": {
      "required": "The {0} given is invalid or incomplete, please review and amend",
      "age": "The lead passenger must be at least 18 years old",
      "generic": "There was a problem submitting the form. Please check the inputs and try again.",
      "leadpax": "Please select one of the passengers as the lead passenger.",
      "leadpaxAge": "The lead passenger must be 18 years old or over at the time of booking. Please amend the date of birth entered, or choose a new lead passenger.",
      "adult_age": "The age of adults must be between {0} and 85 years. Please review and amend.",
      "infant_age": "Infants must be under 2 years old on the date they return from holiday. Please check and amend the date of birth you have entered. Or go back and adjust the ages entered at search. This is so we can provide you with the latest availability.",
      "child_age": "The age of children must be at least 2 years and no more than {0} years. Please review and amend.",
      "title": "The title given for {0} is invalid or incomplete, please review and amend.",
      "age_mismatch": "The date of birth you have entered is not consistent with the child ages entered at the start of your search, which is the age they will be on the date they return from holiday. Please check and amend the dates of birth above. Or go back and adjust the child ages entered at search. This is so we can provide you with the latest availability.",
      "title_required": "Title is incomplete, please review and amend",
      "firstname_required": "The First Name given is invalid or incomplete, please review and amend",
      "lastname_required": "The Last Name given is invalid or incomplete, please review and amend",
      "email_required": "Contact Email given is invalid or incomplete",
      "confirm_email_required": "Confirmation Email given is invalid or incomplete",
      "street_address_required": "Street address given is invalid or incomplete",
      "city_required": "City given is invalid or incomplete",
      "day_required": "The day of birthday given is invalid, please review and amend",
      "month_required": "The month of birthday given is invalid, please review and amend",
      "year_required": "The year of birthday given is invalid, please review and amend",
      "contact_number_required": "Contact Number given is invalid or incomplete",
      "post_code_lookup": "There was a problem getting the addresses for postcode {0}, please review and amend"
    },
    "tooltip": {
      "contactPhone": "From time to time we may have to contact you about important changes to your booking. So please provide a contact number and email address."
    },
    "fieldNames": {
      "paxTitle": "Title",
      "paxName": "First Name",
      "paxSurname": "Last Name",
      "contactEmail": "Email",
      "confirmEmail": "Confirm Email",
      "paxPostCode": "Postal Code",
      "paxHouseNumber": "Street Address",
      "paxStreet": "Address line 2",
      "paxCity": "City",
      "paxCountry": "Country",
      "paxDobDay": "day of birthday",
      "paxDobMonth": "month of birthday",
      "paxDobYear": "year of birthday",
      "contactPhone": "Contact Number",
      "fullName": "Name",
      "address": "Address"
    },
    "ageCode": {
      "ADULT": "adult",
      "CHILD": "child",
      "FREECHILD": "child",
      "INFANT": "infant"
    }
  },
  "confirmation": {
    "moreInfo": "More information",
    "reserveSeats": "reserve your seats online",
    "selectSeats": "select your seat numbers",
    "completeAPI": "Complete API",
    "message": "Congratulations! Your Booking is complete!",
    "livechat": "Live chat",
    "print": "Print this page",
    "hotelCode": "Hotel Code",
    "holidayRefNumber": "Your holiday reference number:",
    "airlineReference": "Your airline reference:",
    "daysToGo": "Days to Go!",
    "tweet": "tweet",
    "share": "share",
    "rooms": "Rooms & passengers",
    "flights": "Flights & dates",
    "included": "What's included",
    "nextStepsHeader": "What's next?",
    "nextStep1": {
      "line1": "You will receive a confirmation e-mail containing all of your booking information. You can also print out a copy of this page for your records.",
      "line2": "Within 5 days of booking, we will send you an email with your Travel Documents, Tour Operator Invoice and ATOL certificate attached.",
      "line3": "<strong>Please note:</strong> If you're flying with Thomas Cook Airlines you are no longer required to present a printed copy of your tickets or travel documentation to check-in for your flight."
    },
    "nextStep2": {
      "line1": "When you fly with Thomas Cook Airlines you can choose and",
      "line2": "If you have selected \"Choose your seat\" at the time of booking, please "
    },
    "nextStep3": {
      "line1": "To check in, you’ll need to complete  Advanced Passenger Information for all passengers. Why not tick this off your list sooner rather than later?"
    },
    "others": "Anything else you need",
    "travelMoney": "Travel money",
    "extras": "Holiday essentials",
    "paymentDetails": "Your contact & payment details",
    "contactDetails": "Contact details",
    "cardDetails": "Card details",
    "card": {
      "type": "Card type",
      "name": "Name on the card",
      "number": "Card number",
      "expiry": "Expiration date"
    },
    "paymentSummary": "Payment summary",
    "holidayTotal": "Holiday Total",
    "depositPaid": "Deposit paid",
    "cardFee": "Card fee",
    "totalPaid": "Total paid",
    "remainingDeposit": "Remaining deposit",
    "remainingBalance": "Remaining balance",
    "dueOn": "(due {0})",
    "balance": "Total balance owed"
  },
  "priceTicket": {
    "error": "Error!",
    "warning": "Warning!",
    "hotelCode": "Hotel code:",
    "adult": "Adult",
    "adults": "Adults",
    "child": "Child",
    "children": "Children",
    "infant": "Infant",
    "infants": "Infants",
    "included": "Included",
    "flight": "Flight",
    "with": "with",
    "alsoIncluded": "Also included in your final holiday price",
    "totalPrice": "Total price was",
    "savings": "Saving today",
    "cardFee": "Card fee",
    "from": "From",
    "pp": "pp",
    "totalPriceFrom": "Total price from",
    "secureToday": "Secure today for",
    "bookToday": "Book today for",
    "totalAmount": "Total price",
    "maxAgeForChild": "Max age for child price",
    "airportTransfer": "Airport transfer"
  },
  "cardTypes": {
    "AX": "American Express",
    "DI": "Diners Club",
    "LA": "Laser",
    "MA": "Maestro",
    "MC": "Mastercard",
    "SO": "Solo",
    "VD": "Visa Debit",
    "VE": "Visa Electron",
    "MD": "Debit Mastercard",
    "VI": "Visa"
  },
  "personName": "{0} {1} {2}",
  "customise": {
    "back": "Back to your holiday",
    "title": "Holiday essentials",
    "subtitle": "Choose or remove from the available extras listed below",
    "continue": "Continue with selections shown",
    "includedIn3for2": "Included as part of 3 for 2",
    "plus5kg": "5kg included with 3 for 2",
    "footer": {
      "price": {
        "title": "Your holiday price",
        "content": "Your holiday price is now correct for your entire party. However, it may vary from the price you saw previously due to system updates - <a href='http://www.thomascook.com/pricing-terms-conditions/' target='_blank'>see How Is My Holiday Cost Calculated</a> for details on how your holiday price is calculated"
      },
      "insurance": {
        "title": "Travel insurance",
        "content": "Thomas Cook Retail Limited is an Appointed Representative of White Horse Insurance Ireland Limited which is authorised and regulated by the Central Bank of Ireland. Thomas Cook Travel Insurance is underwritten by White Horse Insurance Ireland Limited. For more information visit <a href='http://www.centralbank.ie/Pages/home.aspx' target='_blank'>Central Bank</a> of Ireland website."
      }
    },
    "extras": {
      "error": "There was an error submitting your request, please try again or contact support if the problem persists",
      "viewInflightMenuLink": "View our in-flight menu",
      "TCFD": {
        "description": "Please dontate just £2 on top of your holiday cost and we will pass it on to the Thomas Cook Children's charity - which aims to improve the lives of children and the communities in which they live across the world.",
        "checkBoxText": "Yes please, we would like to donate."
      },
      "CYS": {
        "title": "Choose your seat",
        "description": "<ul><li>Use our handy online seating plan to choose and reserve your seats.</li><li>It's available as soon as your booking has been confirmed.</li></ul>",
        "checkBoxText": "Yes please, we could like to choose our own seats.",
        "includedMessage": "Choose your seat is already included."
      },
      "IFM": {
        "description": "<ul><li>3 course hot meal witha tea of coffee</li><li>Meals included on your outbound and return flights</li><li>Meals can only be selected for the whole party</li></ul>",
        "footerDescription": "<em>Created by James Martin. Only on Thomas Cook</em>",
        "checkBoxText": "Yes please, we would like to add in-flight meals",
        "includedMessage": "In-flight meals are included in your holiday price. Please select from the available options"
      },
      "BAG": {
        "title": "Add extra luggage allowance",
        "description": "<p>Your current luggage allowance is <span class=\"baseWeight\"></span>kg each and up to two pieces of luggage each.</p><p>You can increase your total per person allowance for your whole party.</p>",
        "checkBoxText": "Yes please, we would like to add an extra luggage allowance"
      },
      "OFFER": {
        "description": "<p>Add extra luggage allowance and choose your seat, and get your in-flight meals for free!</p><ul><li><strong>Extra luggage allowance:</strong> Your standard luggage allowance is <span class=\"baseWeight\"></span>kg per person. By choosing this option you will get an extra 5kg per person.</li><li><strong>Choose Your Seat:</strong> Use our handy online seating plan to choose and reserve your seats. It's available as soon as your booking is confirmed.</li><li><strong>in-flight meals:</strong> Enjoy a 3 course hot meal with a tea or coffee on your outbound and return flights. If you require a meal other than the standard option then please make your selection in the flight meals section below.</li></ul><em>3 for 2 flight extras can only be selected for your whole party</em>",
        "checkBoxText": "Yes, please include all 3 extras",
        "luggageLine": "+5 kg luggage"
      },
      "INSURANCE": {
        "gold": "Gold",
        "silver": "Silver",
        "title": "Travel insurance",
        "checkBoxText": "Yes please, we would like to add travel insurance",
        "description": "<p>Take away the stress of organising your travel insurance by booking it now with your holiday. The prices shown below include all insurance taxes.</p><ul><li>24 hour, 365 days emergency assistance number</li><li>Book today for immediate cancellation cover</li><li>Medical screening service available</li></ul>",
        "descriptionExtended": "When booking your holiday you will need to ensure that all passengers take out travel insurance before they depart",
        "types": {
          "gold": {
            "packageTitle": "Gold package",
            "detailsList": "<ul><li><span class=\"glyphicon glyphicon-ok\"></span> Emergency Medical Expenses up to &pound;10,000,000</li><li><span class=\"glyphicon glyphicon-ok\"></span> Baggage and personal effets up to &pound;3,000</li><li><span class=\"glyphicon glyphicon-ok\"></span> Cancellation and curtailment up to &pound;10,000</li></ul>"
          },
          "silver": {
            "packageTitle": "Silver package",
            "detailsList": "<ul><li><span class=\"glyphicon glyphicon-ok\"></span> Emergency Medical Expenses up to &pound;5,000,000</li><li><span class=\"glyphicon glyphicon-ok\"></span> Baggage and personal effets up to &pound;1,500</li><li><span class=\"glyphicon glyphicon-ok\"></span> Cancellation and curtailment up to &pound;5,000</li></ul>"
          }
        },
        "stageOne": {
          "blurb": "Please enter the passenger ages. The ages must be as per the date you purchase the insurance (today's date). The insurance price dependent on your age, so the price of insurance may go up or down. Insurance can only be purchased online for the whole party and for single trip policies. Please call 0871 895 0045 once you have made your holiday reservation. Infants (age <2) are covered free of charge.",
          "passengerDescription": "Date of birth of the {0} in the room"
        },
        "getQuote": "Get quote",
        "stageTwo": {
          "agree": "Tick here to confirm you have read and understood the <a href=\"#\">terms and conditions</a> for the purchase of this travel insurance policy",
          "links": "<ul><li><a href=\"#\">Are you eligable to buy our insurance?</a></li><li><a href=\"#\">Further information on existing medical conditions</a></li><li><a href=\"#\">View policy limits and full policy wording</a></li></ul>",
          "terms": "TRAVEL INSURANCE: Thomas Cook Retail Limited is an Appointed Representative of White Horse Insurance Ireland Limited which is authorised and regulated by the Central Bank of Ireland. Thomas Cook Travel Insurance is underwritten by White Horse Insurance Ireland Limited. For more information visit <a href=\"#\">Central Bank of Ireland</a> website."
        }
      }
    }
  },
  "myaccount": {
    "alerts": {
      "forgottenPassEmailFail": {
        "title": "email not sent",
        "content": "unfortunately a server error has prevented us from sending a reset email"
      },
      "userEmailNonexistant": {
        "title": "Sorry, no accounts are associated with the email address you entered. Please try again.",
        "content": "Your username or password was not recognised. If you have forgotten your password, you can reset it below."
      },
      "userConfirmationEmailSent": {
        "title": "Email has been sent",
        "content": "Please check your inbox for the confirm email. This could be on your junk folder."
      },
      "emailWishlist-success": {
        "title": "Email has been sent",
        "content": "If you have sent the email to yourself please check your inbox. This could be in your junk folder."
      },
      "userSignupError": {
        "title": "Error on Signup",
        "content": "There has been an error on the signup process. Please try again later."
      },
      "userAlreadyExists": {
        "title": "Error on Signup",
        "content": "The user already exists."
      },
      "userSignupTerms": {
        "title": "Terms And Conditions",
        "content": "Please accept the Terms and Conditions to proceed."
      },
      "logInError401": {
        "title": "Sorry, no accounts are associated with the email address you entered. Please try again.",
        "content": "Your username or password was not recognised. If you have forgotten your password, you can reset it below."
      },
      "logInError430": {
        "title": "Non-confirmed account",
        "content": "Your account needs to be confirmed, this can be done via the email sent after your registration"
      },
      "activationSuccess": {
        "title": "Email has been sent",
        "content": "Please check your inbox for the confirmation email. This could be in your junk folder"
      },
      "activationError400": {
        "title": "Email Not Sent",
        "content": "Unfortunately a server error has prevented us from sending an activation email."
      },
      "activationError500": {
        "title": "Account Doesn\u0027t Exist",
        "content": "Please try signing up for a new account"
      },
      "unknownError": {
        "title": "Sorry, an unexpected exception occurred",
        "content": "Please refresh page and try again"
      },
      "sendPasswordReset": {
        "title": "Please follow the instructions in the email we sent to you to reset your password",
        "content": "You should receive an email to this account\u0027s registered address, if it exists. Follow the instructions to reset your password"
      },
      "ErrorSendPasswordReset": {
        "title": "Sorry, no accounts are associated with the email address you entered. Please try again.",
        "content": "Unfortunately an error has occurred that has prevented us from sending a reset email"
      }
    },
    "sidebar": {
      "myAccountMenu": "My Account menu",
      "myHome": "My home",
      "myWishlist": "My Wish List",
      "myDetails": "My details",
      "myPreferences": "My Preferences",
      "mySupport": "Customer Support",
      "logout": "Logout"
    },
    "loginWidget": {
      "head": {
        "login": "Login",
        "signUp": "Signup",
        "myAccount": "My Account",
        "signOut": "Sign Out"
      },
      "saveMyWishlist": "Save My Wish List",
      "emailMyWishlist": "Email My Wish List",
      "myAccount": "My Account",
      "email": "Email Address",
      "emailDescription": "Enter your email address",
      "emailInvalid": "Please enter a valid email address",
      "IhaveAnAccount": "I have an account",
      "IamNew": "I'm new here!",
      "password": "Password",
      "enterPassword": "Enter your password",
      "fieldRequired": "This field is required.",
      "enterPasswordError": "Password must contains one upper, one lower and one number.",
      "enter8Character": "Please enter at least 8 characters.",
      "login": "Let's Go",
      "confirmPassword": "Confirm Password",
      "confirmPasswordDescription": "Confirm your password",
      "passwordDontMatch": "Password doesn't match.",
      "notANumber": "Please enter a valid phone number",
      "termsConditions": "I have read and agree to the Site Terms & Conditions",
      "policy1": "By creating an account with us, you accept our",
      "policy2": "Site Terms & Conditions",
      "policy3": "and",
      "policy4": "Privacy Policy",
      "signUp": "Sign Up",
      "emailForgottenPassword": "Enter the email address associated with your My Account, then click Send. We'll send you an email with the link to the page where you can easily reset your password.",
      "forgottenPassword": "Forgotten password?",
      "name": "Name",
      "sendToMe": "Send a copy of the email to my address",
      "enterMessage": "Enter the message for the recipient",
      "enterName": "Enter the name of the recipient",
      "enterEmail": "Enter the email the recipient",
      "message": "Message",
      "send": "Send",
      "save": "Save"
    },
    "resetpassword": {
      "problem": "There was a problem",
      "tryAgain": "Please try again, and if the problem persists please contact Thomas Cook support.",
      "success": "Success",
      "passwordSuccess": "Your password has been successfully reset, you can now",
      "saveWishlist": "Save My Wish List",
      "login": "login",
      "usingNewPassword": "using your new password.",
      "myAccount": "My Account",
      "passwordReset": "Password Reset",
      "emailAddress": "Email Address",
      "newPassword": "New Password",
      "enterNewPassword": "Enter New Password",
      "fieldRequired": "This field is required.",
      "enterValidPassword": "Please enter a valid password.",
      "atLeast8Characters": "Please enter at least 8 characters.",
      "confirmNewPassword": "Confirm New Password",
      "reenterNewPassword": "Re-Enter New Password",
      "passwordDontMatch": "Password doesn't match.",
      "reset": "Reset",
      "signDifferentAccount": "Sign in a different account",
      "registerAccount": "Register My Account",
      "registerButton": "Register"
    },
    "index": {
      "welcome1": "Welcome",
      "welcome2": "My Account",
      "blurb": "The online holiday hub designed to make choosing and booking your next Thomas Cook getaway effortless.",
      "blurb2": "Keep track of all the hotels that caught your eye on our site through our wishlist feature and store your details on your My Details page to speed up your bookings in future.",
      "dreamHoliday": "Your dream holiday is just a click away...",
      "createWishlist": "Create My Wish List",
      "updateDetails": "Update your details...",
      "whatsInside1": "What's inside",
      "whatsInside2": "My Account",
      "options": {
        "wishlist": "Your saved Wishlist",
        "faster": "Faster bookings",
        "upgrades": "Upgrades & Special offers",
        "speedy": "Speedy Check-in",
        "more": "Plus much more!"
      }
    },
    "wishlist": {
      "back": "back",
      "emailWishlist": "Email My Wish List",
      "youhave": "You have",
      "wishlistHolidays": "Wish List",
      "wishlistHolidays2": "holiday",
      "clearAll": "Clear all",
      "addHolidays": "Add holidays to My Wish List",
      "clickCompare": "Click compare to add a holiday",
      "Nights": "Nights",
      "nights": "nights",
      "included": "Included",
      "includedHoliday": "Included in your final holiday price",
      "facilities": "Facilities",
      "location": "Location",
      "tripAdvisorRating": "TripAdvisor Traveller Rating",
      "basedOn": "Based on",
      "reviews": "reviews",
      "thomasCookCustomer": "Thomas Cook customer rating",
      "Rooms": "Rooms",
      "adults": "adults",
      "children": "children",
      "boardBasi": "Board Basis",
      "outboundFlight": "Outbound Flight",
      "inboundFlight": "Inbound Flight",
      "transfer": "Transfer",
      "details": "Details",
      "saveWishlist": "Add To Wish List",
      "remove": "Remove",
      "limitPopupTitle": "You have selected the maximum number of Wish List items.",
      "liimitPopupMessage": "Please remove a saved item first before adding any further holidays.",
      "alerts": {
        "noAvailability": {
          "title": "This holiday is no longer available.",
          "content": "Unfortunatley we do not have any available dates for this holiday.",
          "name": "Remove from Wishlist"
        },
        "noDetails": {
          "title": "Cannot load details for this holiday.",
          "content": "Please try again later.",
          "name": ""
        },
        "maxedComparisons": {
          "title": "You have selected the maximum number of compare items.",
          "content": "You can remove an item from compare by clicking grey compared button.",
          "name": "OK"
        },
        "clearWishlist": {
          "title": "Wishlist Removal",
          "content": "Are you sure you want to remove all the saved wishlist items?",
          "cancel": "Cancel",
          "remove": "Remove"
        }
      }
    },
    "details": {
      "myDetails": "My Details",
      "description": "Complete your profile and speed through the booking process - you can of course update these at any time you wish. Share and exchange photos of your favourite hotels or even brag about the resort you’re headed to, by linking your profile to your Facebook, Twitter or Google + account.",
      "myPersonalDetails": "My personal details",
      "title": "Title",
      "selectTitle": "Select title",
      "fullName": "Full Name",
      "firstName": "First Name(s)",
      "surname": "Surname",
      "security": "For security reasons, you can't change your name without contacting customer services with supporting evidence e.g. photocopy of marriage certificate or passport photo page",
      "dateOfBirth": "Date of Birth",
      "day": "Day",
      "month": "Month",
      "year": "Year",
      "postcode": "Postcode",
      "findAddress": "Find address",
      "enterAddressManually": "Enter address manually",
      "selected": "Select from list of returned addresses",
      "streetAddress": "Street Address",
      "firstAddress": "First line of address",
      "secondAddress": "Second line of address",
      "country": "Country",
      "countryDescription": "United Kingdom",
      "countryCode": "Country Code",
      "phoneNumber": "Phone Number",
      "yourPhoneNumber": "Your phone number",
      "mobileNumber": "Mobile Number",
      "myAccountSettings": "My Account settings",
      "emailAddress": "Email Address",
      "change": "Change",
      "password": "Password",
      "requiredField": "This field is required.",
      "validPassword": "Please enter a valid password",
      "atLeast8Characters": "Please enter at least 8 characters.",
      "confirmPassword": "Confirm Password",
      "passwordDontMatch": "Password doesn't match.",
      "notANumber": "Please enter a valid phone number",
      "cancelChanges": "Cancel changes",
      "saveChanges": "Save changes",
      "alerts": {
        "success": {
          "title": "Success!",
          "content": "Your details have been saved."
        },
        "noData": {
          "title": "Sorry, we were unable to load your details.",
          "content": "Please refresh page and try again."
        },
        "loggedOut": {
          "title": "Sorry, it appears you are not logged in",
          "content": "Please log in and try again"
        },
        "unknownError": {
          "title": "Sorry, an unexpected exception occurred",
          "content": "Please refresh page and try again"
        }
      }
    },
    "preference": {
      "myPreference": "My Preferences",
      "switchHoliday": "Switch into holiday mode! Use the button switches below to receive your weekly dose of sunshine straight into your e-mail inbox from our Thomas Cook extras.",
      "subcriptions": "My personal details",
      "tuesdayInspiration": "Tuesday Inspiration",
      "weekly": "Weekly",
      "toggle": "toggle",
      "latestPrices": "The latest prices in your favorite cities, top deals in dream destinations and personalised recommendations. Get inspired!",
      "bookingAssistant": "Your Booking Assistant",
      "duringBooking": "During your booking",
      "planYourTrip": "Plan your trip with hand-picked deals and notifications from our travel experts. Let us make booking even easier.",
      "justDeals": "Just Deals",
      "everyFriday": "Every Friday we’ll send you our biggest and best discounts",
      "lazySundays": "Lazy Sunday",
      "lazySundaysText": "No need to rush - our Lazy Sunday edition includes subscriber-only deals, promotional offers and unpdates on our newest features.",
      "cancelChanges": "Cancel changes",
      "saveChanges": "Save changes"
    },
    "support": {
      "customer": "Customer Support",
      "blurb": "You should be able to find all the information you need on our website. However, if you need any extra support with your holiday choice or how to use our site then please contact our dedicated team online via live chat (here for you 9am - 6pm daily) or via email.",
      "help": "Help when you need it...",
      "holiday": "Your next holiday",
      "manage": "Manage",
      "livechat": "Live Chat",
      "talk": "Talk to us",
      "callUs": "Call Us",
      "writetous": "Write to us",
      "emailus": "Email us",
      "storelocator": "Store locator",
      "findus": "Find Us"
    },
    "widget": {
      "state": {
        "myAccount": "My Account",
        "forgottenPassword": "Forgotten Password"
      },
      "forgottenPassEmailFail": {
        "title": "Email not sent.",
        "content": "Unfortunately a server error has prevented us from sending a reset email.",
        "name": "Resend email"
      },
      "userEmailNonexistant": {
        "title": "Sorry, no accounts are associated with the email address you entered. Please try again.",
        "content": "Your username or password was not recognised. If you have forgotten your password, you can reset it below.",
        "name": "Sign up"
      },
      "userConfirmationEmailSent": {
        "title": "Email has been sent",
        "content": "Please check your inbox for the confirm email. This could be on your junk folder.",
        "name": "Sign up"
      },
      "userSignupError": {
        "title": "Error on Signup ",
        "content": "There has been an error on the signup process. Please try again later. ",
        "name": "Sign up"
      },
      "userAlreadyExists": {
        "title": "Error on Signup.",
        "content": "The user already exists.",
        "name": "Sign up"
      },
      "userSignupTerms": {
        "title": "Terms And Conditions ",
        "content": "Please accept the Terms and Conditions to proceed. ",
        "name": "Sign up"
      },
      "logInError-401": {
        "title": "Sorry, no accounts are associated with the email address you entered. Please try again. ",
        "content": "Your username or password was not recognised. If you have forgotten your password, you can reset it below. ",
        "name": "Non-confirmed account"
      },
      "logInError-430": {
        "title": "Non-confirmed account",
        "content": "Your account needs to be confirmed, this can be done via the email sent after your registration.",
        "name": "Resend email"
      },
      "activationSuccess": {
        "title": "Email has been sent",
        "content": "Please check your inbox for the confirmation email. This could be in your junk folder.",
        "name": "Email Not Sent "
      },
      "activationError-400": {
        "title": "Email Not Sent.",
        "content": "Unfortunately a server error has prevented us from sending an activation email.",
        "name": "Resend email"
      },
      "activationError-500": {
        "title": "Account Doesn't Exist.",
        "content": "Please try signing up for a new account."
      },
      "unknownError": {
        "title": "Sorry, an unexpected exception occurred",
        "content": "Please refresh page and try again "
      },
      "sendPasswordReset": {
        "title": "Please follow the instructions in the email we sent to you to reset your password.",
        "content": "You should receive an email to this account's registered address, if it exists. Follow the instructions to reset your password."
      },
      "ErrorSendPasswordReset": {
        "title": "Sorry, no accounts are associated with the email address you entered. Please try again.",
        "content": "Unfortunatley an error has occured that has prevented us from sending a reset email"
      }
    },
    "activation": {
      "title": "Account Activated",
      "header": "There was a problem activating your account"
    },
    "login": {
      "header": "My Account",
      "activationError": "There was a problem activating your account",
      "success": "Success, your details have been saved.",
      "emailAddress": "Email Address",
      "passwordMust5Digits": "Password must be more than 5 digits.",
      "forgottenPassword": "Forgotten password",
      "signInDifferentAccount": "Sign in a different account",
      "associatedEmail": "Enter the email address associated with your My Account, then click Send. We'll send you an email with the link to the page where you can easily reset your password.",
      "passwordRequired": "Password is required.",
      "forgottenPasswordQuestion": "Forgotten password?",
      "send": "Send",
      "tryAgain": "Please try again, and if the problem persists please contact Thomas Cook support.",
      "placeHolder": {
        "emailAddress": "Enter your email address",
        "enterEmailAddress": "Enter your email address",
        "enterPassword": "Enter Password"
      }
    },
    "myBookings": "This is the mybookings view"
  }
}""")

  val jsonB1 = parse("""{
    "prop-only-b" : "val2",
    "common" : "val common"
	}""")

  val jsonB2 = parse("""{
    "prop-only-b" : {
		"nested-only-b": "b"
	},
    "almost-common" : {
		"val common" : "common",
		"val b" : "b"
	}
	}""")

  val jsonB3 = parse("""{
    "apiDateFormat": "YYYYMMDD",
    "uiDateFormat": "DD-MMM-YYYY",
    "GBP": "&#163;",
    "USD": "&#36;",
    "EUR": "&#128;",
    "common": {
        "undo": "Undo",
        "on" : "on",
        "close": "Close",
        "select": "Select",
        "previous": "Previous",
        "next": "Next",
        "room": "Room",
        "nights": "Nights",
        "hide": "Hide",
        "show": "Show",
        "with": "with",
        "allResults": "all Results",
        "providedBy": "Provided by",
        "providedByFull": "This Holiday is provided by",
        "error": "There was a problem",
        "notFound": "We are really sorry but the page you requested cannot be found. Please check the request and try again.",
        "generic_error": "We are sorry but we could not process your request because of a system error. Please try again after sometime. If you still experience problems, please call 0844 879 8444 (Mon – Sun: 8am – 10pm)",
        "title": "Title",
        "numbers": [
            "first",
            "second",
            "third",
            "fourth",
            "fifth",
            "sixth",
            "seventh",
            "eighth",
            "ninth"
        ],
        "date": {
            "day": "Date",
            "month": "Month",
            "year": "Year"
        },
        "titles": [
            {
                "name": "Mr",
                "value": "MR"
            },
            {
                "name": "Mrs",
                "value": "MRS"
            },
            {
                "name": "Ms",
                "value": "MS"
            },
            {
                "name": "Miss",
                "value": "MISS"
            }
        ],
        "childTitles": [
            {
                "name": "Master",
                "value": "MR"
            },
            {
                "name": "Miss",
                "value": "MISS"
            }
        ],
        "months": [
            {
                "name": "January",
                "value": 1
            },
            {
                "name": "February",
                "value": 2
            },
            {
                "name": "March",
                "value": 3
            },
            {
                "name": "April",
                "value": 4
            },
            {
                "name": "May",
                "value": 5
            },
            {
                "name": "June",
                "value": 6
            },
            {
                "name": "July",
                "value": 7
            },
            {
                "name": "August",
                "value": 8
            },
            {
                "name": "September",
                "value": 9
            },
            {
                "name": "October",
                "value": 10
            },
            {
                "name": "November",
                "value": 11
            },
            {
                "name": "December",
                "value": 12
            }
        ]
    },
    "search": {
        "updatingYourResults": "Updating your results",
        "holidaysFound": "holidays found",
        "whatsIncludedFooter": "There is no fee if you pay by debit card. A 2% fee (up to a maximum of £95) will be charged if you pay by credit card",
        "bar": {
          "anyDestination": "Any destination",
          "anyAirport": "Any Airport",
          "whereTo": "Where To ?",
          "fromWhere": "From where ?",
          "whenAndHowLong": "When and how long ?",
          "with": "With ?",
          "when": "When ?",
          "iAmFlexible": "I'm flexible +/- 3 days",
          "howLongFor": "How long for ?",
          "apply": "Apply",
          "search": "Search",
          "edit": "Edit",
          "addAnotherRoom": "Add another room",
          "removeARoom": "Remove a room"
        },
        "filters": {
            "basicFilters": "Basic Filters",
            "sortByRelevance": "Sort by relevance",
            "list": "List",
            "map": "Map",
            "viewOnMap": "View on map",
            "filter": "Filters",
            "refineYourSearch": "Refine your Search"
        },
        "errors": {
          "pleaseSpecifyChildAge": "Please specify child age",
          "moreThan9Guests": "Booking for more than 9 people ?",
          "callUs": "Please call 0844 879 8493 to speak to one our advisors who will help you with your holiday needs.",
          "moreInfantsThanAdults": "More infants than adults ?",
          "contactUs": "If you still experience problems, please call 0844 879 8444 (Mon – Sun: 8am – 10pm)",
            "suggestion": {
                "airport": [
                    "Sorry, we can't find your airport",
                    "Please choose a different airport, or ensure your selection is spelt correctly."
                ],
                "destination": [
                    "Sorry, we can't find your destination",
                    "Please choose a different destination, or ensure your selection is spelt correctly."
                ],
                "airportTitle": "Sorry, we can't find your airport",
                "airportMessage": "Please choose a different airport, or ensure your selection is spelt correctly.",
                "destinationTitle": "Sorry, we can't find your destination",
                "destinationMessage": "Please choose a different destination, or ensure your selection is spelt correctly."
            },
            "results": {
                "500": [
                    "We're sorry, we did not receive a response from our system, please try searching for your holiday again in a few minutes.",
                    "If you still experience problems, please call 0844 879 8444 (Mon – Sun: 8am – 10pm)"
                ],
                "1008": [
                    "1008",
                    "Sorry, there are currently no holidays available that meet your search criteria. Please change your departure date and/or duration options, or change your star rating and/or board basis options.",
                    "Your holiday may not be available on the dates you are searching, view more dates to see our popular holiday destinations.",
                    "Alternatively, for flexible departure airports and flight durations, please visit our flight + hotel page.",
                    "If you still experience problems, please call 01733 224 800 (Mon – Sun: 8am – 10pm) to speak to a travel advisor. [Error Code: 1008]"
                ]
            }
        },
        "flightSeats": {
          "hurryNote": "{0}Hurry{1}&nbsp;only {2} seat(s) left!",
          "availability": "Only {0} seat(s) left!",
          "lastAvailability": "Last flight seat availability check was at 09:00 am on {0}",
          "notice": "<h5>Notice</h5><p>You may be able to choose other seats from the accommodation page, but the cost of it may be higher. We may occasionally put some seats on sale at the later date.</p><p>This shows how many seats are available for this holiday at this moment.</p>"
        },
        "rooms": {
          "hurryNote": "{0}Hurry{1}&nbsp;only {2} room(s) left!",
          "availability": "Only {0} room(s) left!",
          "lastAvailability": "Last room availability check was at 09:00 am on {0}",
          "notice": "<h5>Notice</h5><p>You may be able to choose other room types from the accommodation page, but the cost of it may be higher. We may occasionally add more of the same room types on sale at a later date.</p>"
        }
    },
    "accom": {
        "bookNow": "Book Now",
        "rooms": "Rooms",
        "flight": "Flight",
        "facilities": "Facilities",
        "reviews": "Reviews",
        "askNAnswers": "Ask & Answers",
        "hotelHighlights": "Hotel highlights",
        "video": "Video",
        "benefits": "Benefits",
        "yourHotelRoom": "Your hotel room",
        "boardBasis": "Board Basis",
        "only": "Only",
        "roomsLeft": "rooms left!",
        "maxAdults": "Max adults",
        "select": "Select",
        "yourCurrentRoom": "Your current room",
        "yourHotel": "Your Hotel",
        "roomInfo": "Room Info",
        "noSupportForVideo": "Your browser does not support the video tag.",
        "yourFlight": "Your flight",
        "duration": "Duration",
        "priceForWholeParty": "Prices shown are total for the whole party",
        "flightDetails": "Flight details",
        "totalPriceWas": "Total price was",
        "SavingToday": "Saving today",
        "totalPriceFrom": "Total price from",
        "totalPrice": "Total price",
        "cardFeeApplies": "A 2% fee (up to a maximum of £95) will be charged if you pay by credit card",
        "noDebitCardCharges": "No debit card charges",
        "balcony": "balcony",
        "priceCorrectAsOf": "Price correct as of",
        "selectAndClose" : "Select & Close",
        "close" : "Close",
        "noDebitCharges" : "No debit card charges",
        "2PercentFee" : "A 2% fee (up to a maximum of £95) will be charged if you pay by credit card",
        "priceCorrect" :"Price correct as of ",
        "9am":"09:00 am on",
        "currentChoice" : "Current choice",
        "inboundWith" : "Inbound with",
        "outboundWith" : "Outbound with",
        "selected" : "Selected",
        "cheapest" : "Cheapest",
        "totalPrices" : "Prices shown are total for the whole party",
        "fromTripAdvisor": "From TripAdvisor",
        "fromOurCustomers": "From our customers",
        "reviewsTitle": "Thomas Cook reviews"
    },
    "checkout": {
        "errors": {
            "default": "Something went wrong. Please try again. (Error Code: {0})"
        },
    "progressBar": {
      "step1Long": "Your holiday",
      "step2Long": "Holiday essentials",
      "step3Long": "Passenger details",
      "step4Long": "Payment",
      "step5Long": "Done",
      "step1Short": "Holiday",
      "step2Short": "Essentials",
      "step3Short": "Passengers",
      "step4Short": "Payment",
      "step5Short": "Done"
    },
        "payment": {
            "checkDetailsAndPay": "Check your details and pay",
            "paymentQuestion": "How would you like to pay?",
            "oneLastStep": "One last step, you are nearly done",
            "holidayTotal": "Holiday total",
            "deposit": "Deposit",
            "cardFee": "Card fee",
            "secureToday": "Secure today for",
            "remDeposit": "Remaining deposit",
            "remBalance": "Remaining balance",
            "totalBalance": "Total balance owed",
      "flightAccomNotice": "Please read the latest&nbsp;<a class='link' id='errataFlightAccomLink' data-toggle='modal' data-target='#errataFlightAccomModal'>flight/accommodation updates</a>&nbsp;for this holiday before proceeding",
            "bookCondition": {
                "line1": "I accept it is my responsibility to read and understand the",
                "link": "Booking Conditions & Holiday Information",
                "line2": "of the Tour Operator."
            },
            "ourGuide": {
                "line1": "All members of your party must satisfy the entry requirements for the country you are travelling to. Visit the FCO Travel Advice website or view",
                "link": "our guide",
                "line2": "to passport/visa/health information."
            },
            "toPaytoday": "To pay today",
            "confirmPay": "Confirm and pay",
            "dueMessage": "(due {0})",
            "validationErrors": {
                "tAndC": "You must check to accept the Terms and Conditions"
            },
            "acceptedCards": "We accept these cards:",
            "customerAssurance": "You are in good hands",
            "creditCardFeeMessage": "There is no fee if you pay by debit card. A 2% fee (up to a maximum of &pound;95) will be charged if you pay by credit card.",
            "promocode": "Promo code",
            "cardInfo": "Enter your card information",
            "mandatoryInfo": "All fields marked <span class=\"glyphicon glyphicon-asterisk\"></span> must be completed",
            "cardtype": "Card type",
            "selectCardType": "Select a card type",
            "cardNumber": "Card number",
            "cardHoldersName": "Name on card",
            "expiryDate": "Expiration date",
            "securityCode": "Card security code",
            "error": {
                "cardtype": "The number you've entered doesn't match your chosen card type. Please try again or choose another card type.",
                "cardNumber": "The number you've entered is invalid. Please check and try again.",
                "cardNumberIncomplete": "The number you've entered is incomplete or invalid. Please check and try again.",
                "expiryDate": "The expiry date you've selected is invalid. Please check and try again.",
                "expriyMonth": "The expiry month is empty, please review and amend",
                "expiryYear": "The expiry year is empty, please review and amend",
                "cardHoldersName": "The name on card is empty or invalid, please review and amend",
                "securityCode": "The Card Security Code you've entered is invalid. Please check and try again",
                "securityCodeIncomplete": "The security number is incomplete or invalid, please review and amend"
            },
            "room": "Room",
            "contactDetails": {
                "title": "Contact Details",
                "name": "Name",
                "email": "Email",
                "phone": "Phone",
                "address": "Address"
            }
        },
        "processPayment": {
            "header": "You're nearly there",
            "paymentInstructions": "Your bank is carrying out additional authentication checks to secure your payment. They may request additional information to ensure that the payment is valid and being requested by you, the cardholder. Please do not close your browser or click back whilst this takes place. You may wish to contact your bank if you have any queries."
        },
        "paymentType": {
            "lowDepositTitle": "Low Deposit",
            "standardDepositTitle": "Standard Deposit",
            "payFullTitle": "Pay in Full",
            "lowDepositBlurb" : "Pay <strong>{0}</strong>  deposit now. The remaining <strong>{1}</strong> deposit balance is due {2}. The remaining balance of <strong>{3}</strong> is due {4}. Click <a href='http://www.thomascook.com/pricing-terms-conditions' target='_blank'>here</a> for the low deposit terms & conditions.",
            "lowDepositBlurb1" : "Pay <strong>{0}</strong>  deposit now. The remaining <strong>{1}</strong> deposit balance is due {2}. The remaining balance of <strong>{3}</strong> is due {4}.",
            "lowDepositBlurb2" : "Click <a href='http://www.thomascook.com/pricing-terms-conditions' target='_blank'>here</a> for the low deposit terms & conditions.",
            "standardDepositBlurb": "Pay <strong>{0}</strong> deposit now. The remaining balance of <strong>{1}</strong> is due {2}.",
            "payFullBlurb": "Pay the full amount now and look forward to your holiday worry-free.",
            "cardFee": "Please note a {0}% fee (maximum charge £95) will be charged for this method of payment."
        },
        "pax": {
            "paxDetails": "Passenger Details"
        }
    },
    "basket": {
        "errors": {
            "ETIMEDOUT": "There was an error contacting the booking system. Please try submitting this request again.",
            "ECONNREFUSED": "There was an error contacting the booking system. Please try again later.",
            "TOSCA_AVAIL_RS_ERROR": "This holiday package is sold out. Please try another holiday package.",
            "COST_RS_ERROR": "There was an error getting current price for this holiday package. Please try again later.",
            "RECOST_RS_ERROR": "There was an error getting current price for this holiday package. Please try again later.",
            "PAX_RS_ERROR": "There was an error processing this booking. Please check the inputs and submit again or try again later.",
            "ERROR_COST_RS": "There was an error getting current price for this holiday package. Please try again later.",
            "BOOK_HOLD_RS_ERROR": "There was an error processing this booking. Please try again later.",
            "BOOK_HOLD_RS_TOSCA_ERROR": "There was an error processing this booking. Please try again later.",
            "BOOK_HOLD_OR_COMMIT_RS_EXCEPTION_ERROR": "There was an error processing this booking. Please try again later.",
            "BOOK_COMMIT_RS_ERROR": "There was an error processing this booking. Please try again later.",
            "BOOK_COMMIT_RS_TOSCA_ERROR": "There was an error processing this booking. Please try again later.",
            "PH_CONTENT_RS_ERROR": "There was an error processing this booking. Please try again later.",
            "PH_SEARCH_RS_ERROR": "There was an error processing this booking. Please try again later.",
            "BOOK_COMMIT_RS_WEBRIO_ERROR": "There was an error processing this booking. Please try again later.",
            "BASKET_RS_ERROR": "There was an error processing this booking. Please try again later.",
            "TOSCA_EXTRA_RS_ERROR": "There was an error processing this booking. Please try again later.",
            "TOSCA_COST_RS_ERROR": "There was an error getting current price for this holiday package. Please try again later.",
            "MULTI_RECOST_RS_ERROR": "There was an error getting current price for this holiday package. Please try again later.",
            "DATACASH_RS_ERROR": "There was an error processing the payment. Please try again later.",
            "DATACASH_COMMIT_RS_ERROR": "There was an error processing the payment. Please try again later.",
            "DATACASH_CANCEL_RS_ERROR": "There was an error processing the payment. Please try again later.",
            "BOOK_COMMIT_RS_NURVIS_ERROR": "There was an error processing this booking. Please try again later.",
            "not_found": "We are sorry but your session has timed out. Please start again.",
            "generic": "There was an error contacting the booking system. Please check the inputs and try submitting this request again."
        }
    },
    "login": "Login",
    "signup": "Signup",
    "liveChat": "Live chat",
    "callUs": "Call us",
    "edit": "Edit",
    "complex": "Replace {0} this in the string, and this too: {1}",
    "pax": {
        "back": "Back to holiday essentials",
        "title": "Tell us who is travelling",
        "continue": "Continue",
        "required": "Required",
        "findAddress": "Find address",
        "manualAddress": "Or enter your address manually",
        "selectAddress": "Street Address",
        "selectAddressDefault": "Select Address",
        "dobLabel": "Date of birth",
        "otherPaxSection": "Enter other passenger details",
        "otherPax": "Other passenger details",
        "roomDetails": "Room details",
        "prompt": "Please enter the details of the {0} {1} staying in this room",
        "infantAge": "under 2 years old on return",
        "childAge": "{0} years old on return",
        "checkLeadPaxMsg": "Please check that all lead passenger details are correct before continuing.",
        "lead": {
            "details": "Lead passenger details",
            "title1": "Enter the details of the lead passenger, who will be responsible for all of your holiday arrangements, including any changes you may wish to make. They will also receive all travel documents and updates by email. ",
            "title2": "All fields marked <span class=\"glyphicon glyphicon-asterisk\"></span> must be completed.",
            "marketing": "Yes, I would like to use this e-mail address to receive promotional offers and emails from Thomas Cook companies. Your personal details will not be passed to any third parties, except where necessary to process your booking or enquiry. For more information, please see our",
            "policy": "Privacy Policy.",
            "existing": "This is your lead passenger",
            "check": "Change the lead passenger to this room",
            "room": "Room"
        },
        "dob": {
            "day": "Day",
            "month": "Month",
            "year": "Year"
        },
        "error": {
            "required": "The {0} given is invalid or incomplete, please review and amend",
            "age": "The lead passenger must be at least 18 years old",
            "generic": "There was a problem submitting the form. Please check the inputs and try again.",
            "leadpax": "Please select one of the passengers as the lead passenger.",
            "leadpaxAge": "The lead passenger must be 18 years old or over at the time of booking. Please amend the date of birth entered, or choose a new lead passenger.",
            "adult_age": "The age of adults must be between {0} and 85 years. Please review and amend.",
            "infant_age": "Infants must be under 2 years old on the date they return from holiday. Please check and amend the date of birth you have entered. Or go back and adjust the ages entered at search. This is so we can provide you with the latest availability.",
            "child_age": "The age of children must be at least 2 years and no more than {0} years. Please review and amend.",
            "title": "The title given for {0} is invalid or incomplete, please review and amend.",
            "age_mismatch": "The date of birth you have entered is not consistent with the child ages entered at the start of your search, which is the age they will be on the date they return from holiday. Please check and amend the dates of birth above. Or go back and adjust the child ages entered at search. This is so we can provide you with the latest availability.",
            "title_required": "Title is incomplete, please review and amend",
            "firstname_required": "The First Name given is invalid or incomplete, please review and amend",
            "lastname_required": "The Last Name given is invalid or incomplete, please review and amend",
            "email_required": "Contact Email given is invalid or incomplete",
            "confirm_email_required": "Confirmation Email given is invalid or incomplete",
            "street_address_required": "Street address given is invalid or incomplete",
            "city_required": "City given is invalid or incomplete",
            "day_required": "The day of birthday given is invalid, please review and amend",
            "month_required": "The month of birthday given is invalid, please review and amend",
            "year_required": "The year of birthday given is invalid, please review and amend",
            "contact_number_required": "Contact Number given is invalid or incomplete",
            "post_code_lookup": "There was a problem getting the addresses for postcode {0}, please review and amend"
        },
        "tooltip": {
            "contactPhone": "From time to time we may have to contact you about important changes to your booking. So please provide a contact number and email address."
        },
        "fieldNames": {
            "paxTitle": "Title",
            "paxName": "First Name",
            "paxSurname": "Last Name",
            "contactEmail": "Email",
            "confirmEmail": "Confirm Email",
            "paxPostCode": "Postal Code",
            "paxHouseNumber": "Street Address",
            "paxStreet": "Address line 2",
            "paxCity": "City",
            "paxCountry": "Country",
            "paxDobDay": "day of birthday",
            "paxDobMonth": "month of birthday",
            "paxDobYear": "year of birthday",
            "contactPhone": "Contact Number",
            "fullName": "Name",
            "address": "Address"
        },
        "ageCode": {
            "ADULT": "adult",
            "CHILD": "child",
            "FREECHILD": "child",
            "INFANT": "infant"
        }
    },
    "confirmation": {
        "moreInfo": "More information",
        "reserveSeats": "reserve your seats online",
        "selectSeats": "select your seat numbers",
        "completeAPI": "Complete API",
        "message": "Congratulations! Your Booking is complete!",
        "livechat": "Live chat",
        "print": "Print this page",
        "hotelCode": "Hotel Code",
        "holidayRefNumber": "Your holiday reference number:",
        "airlineReference" : "Your airline reference:",
        "daysToGo": "Days to Go!",
        "tweet": "tweet",
        "share": "share",
        "rooms": "Rooms & passengers",
        "flights": "Flights & dates",
        "included": "What's included",
        "nextStepsHeader": "What's next?",
        "nextStep1": {
            "line1": "You will receive a confirmation e-mail containing all of your booking information. You can also print out a copy of this page for your records.",
            "line2": "Within 5 days of booking, we will send you an email with your Travel Documents, Tour Operator Invoice and ATOL certificate attached.",
            "line3": "<strong>Please note:</strong> If you're flying with Thomas Cook Airlines you are no longer required to present a printed copy of your tickets or travel documentation to check-in for your flight."
        },
        "nextStep2": {
            "line1": "When you fly with Thomas Cook Airlines you can choose and",
            "line2": "If you have selected \"Choose your seat\" at the time of booking, please "
        },
        "nextStep3": {
            "line1": "To check in, you’ll need to complete  Advanced Passenger Information for all passengers. Why not tick this off your list sooner rather than later?"
        },
        "others": "Anything else you need",
        "travelMoney": "Travel money",
        "extras": "Holiday essentials",
        "paymentDetails": "Your contact & payment details",
        "contactDetails" : "Contact details",
        "cardDetails" : "Card details",
        "card": {
            "type": "Card type",
            "name": "Name on the card",
            "number": "Card number",
            "expiry": "Expiration date"
        },
        "paymentSummary": "Payment summary",
        "holidayTotal": "Holiday Total",
        "depositPaid": "Deposit paid",
        "cardFee": "Card fee",
        "totalPaid": "Total paid",
        "remainingDeposit": "Remaining deposit",
        "remainingBalance": "Remaining balance",
        "dueOn" : "(due {0})",
        "balance": "Total balance owed"
    },
    "priceTicket": {
        "error": "Error!",
        "warning": "Warning!",
        "hotelCode": "Hotel code:",
        "adult": "Adult",
        "adults": "Adults",
        "child": "Child",
        "children": "Children",
        "infant": "Infant",
        "infants": "Infants",
        "included": "Included",
        "flight": "Flight",
        "with": "with",
        "alsoIncluded": "Also included in your final holiday price",
        "totalPrice": "Total price was",
        "savings": "Saving today",
        "cardFee": "Card fee",
        "from": "From",
        "pp": "pp",
        "totalPriceFrom": "Total price from",
        "secureToday": "Secure today for",
        "bookToday": "Book today for",
        "totalAmount": "Total price",
        "maxAgeForChild": "Max age for child price",
        "airportTransfer": "Airport transfer"
    },
    "cardTypes": {
        "AX": "American Express",
        "DI": "Diners Club",
        "LA": "Laser",
        "MA": "Maestro",
        "MC": "Mastercard",
        "SO": "Solo",
        "VD": "Visa Debit",
        "VE": "Visa Electron",
        "MD": "Debit Mastercard",
        "VI": "Visa"
    },
    "personName": "{0} {1} {2}",
    "customise": {
        "back": "Back to your holiday",
        "title": "Holiday essentials",
        "subtitle": "Choose or remove from the available extras listed below",
        "continue": "Ga verder met selecties getoond",
        "includedIn3for2": "Included as part of 3 for 2",
        "plus5kg": "5kg included with 3 for 2",
        "footer": {
            "price": {
                "title": "Your holiday price",
                "content": "Your holiday price is now correct for your entire party. However, it may vary from the price you saw previously due to system updates - <a href='http://www.thomascook.com/pricing-terms-conditions/' target='_blank'>see How Is My Holiday Cost Calculated</a> for details on how your holiday price is calculated"
            },
            "insurance": {
                "title": "Travel insurance",
                "content": "Thomas Cook Retail Limited is an Appointed Representative of White Horse Insurance Ireland Limited which is authorised and regulated by the Central Bank of Ireland. Thomas Cook Travel Insurance is underwritten by White Horse Insurance Ireland Limited. For more information visit <a href='http://www.centralbank.ie/Pages/home.aspx' target='_blank'>Central Bank</a> of Ireland website."
            }
        },
        "extras": {
            "error": "There was an error submitting your request, please try again or contact support if the problem persists",
            "TCFD": {
                "description": "Please dontate just £2 on top of your holiday cost and we will pass it on to the Thomas Cook Children's charity - which aims to improve the lives of children and the communities in which they live across the world.",
                "checkBoxText": "Yes please, we would like to donate."
            },
            "CYS": {
                "title": "Choose your seat",
                "description": "<ul><li>Use our handy online seating plan to choose and reserve your seats.</li><li>It's available as soon as your booking has been confirmed.</li></ul>",
                "checkBoxText": "Yes please, we could like to choose our own seats."
            },
            "IFM": {
                "description": "<ul><li>3 course hot meal witha tea of coffee</li><li>Meals included on your outbound and return flights</li><li>Meals can only be selected for the whole party</li></ul><em>Created by James Martin. Only on Thomas Cook</em>",
                "checkBoxText": "Yes please, we would like to add in-flight meals",
                "includedMessage": "In-flight meals are included in your holiday price. Please select from the available options"
            },
            "BAG": {
                "title": "Add extra luggage allowance", 
                "description": "<p>Your current luggage allowance is <span class=\"baseWeight\"></span>kg each and up to two pieces of luggage each.</p><p>You can increase your total per person allowance for your whole party.</p>",
                "checkBoxText": "Yes please, we would like to add an extra luggage allowance"
            },
            "OFFER": {
                "description": "<p>Add extra luggage allowance and choose your seat, and get your in-flight meals for free!</p><ul><li><strong>Extra luggage allowance:</strong> Your standard luggage allowance is <span class=\"baseWeight\"></span>kg per person. By choosing this option you will get an extra 5kg per person.</li><li><strong>Choose Your Seat:</strong> Use our handy online seating plan to choose and reserve your seats. It's available as soon as your booking is confirmed.</li><li><strong>in-flight meals:</strong> Enjoy a 3 course hot meal with a tea or coffee on your outbound and return flights. If you require a meal other than the standard option then please make your selection in the flight meals section below.</li></ul><em>3 for 2 flight extras can only be selected for your whole party</em>",
                "checkBoxText": "Yes, please include all 3 extras",
                "luggageLine": "+5 kg luggage"
            },
            "INSURANCE": {
                "gold": "Gold",
                "silver": "Silver",
                "title": "Travel insurance",
                "checkBoxText": "Yes please, we would like to add travel insurance",
                "description": "<p>Take away the stress of organising your travel insurance by booking it now with your holiday. The prices shown below include all insurance taxes.</p><ul><li>24 hour, 365 days emergency assistance number</li><li>Book today for immediate cancellation cover</li><li>Medical screening service available</li></ul>",
                "descriptionExtended": "When booking your holiday you will need to ensure that all passengers take out travel insurance before they depart",
                "types": {
                    "gold": {
                        "packageTitle": "Gold package",
                        "detailsList": "<ul><li><span class=\"glyphicon glyphicon-ok\"></span> Emergency Medical Expenses up to &pound;10,000,000</li><li><span class=\"glyphicon glyphicon-ok\"></span> Baggage and personal effets up to &pound;3,000</li><li><span class=\"glyphicon glyphicon-ok\"></span> Cancellation and curtailment up to &pound;10,000</li></ul>"
                    },
                    "silver": {
                        "packageTitle": "Silver package",
                        "detailsList": "<ul><li><span class=\"glyphicon glyphicon-ok\"></span> Emergency Medical Expenses up to &pound;5,000,000</li><li><span class=\"glyphicon glyphicon-ok\"></span> Baggage and personal effets up to &pound;1,500</li><li><span class=\"glyphicon glyphicon-ok\"></span> Cancellation and curtailment up to &pound;5,000</li></ul>"
                    }
                },
                "stageOne": {
                    "blurb": "Please enter the passenger ages. The ages must be as per the date you purchase the insurance (today's date). The insurance price dependent on your age, so the price of insurance may go up or down. Insurance can only be purchased online for the whole party and for single trip policies. Please call 0871 895 0045 once you have made your holiday reservation. Infants (age <2) are covered free of charge.",
                    "passengerDescription": "Date of birth of the {0} in the room"
                },
                "getQuote": "Get quote",
                "stageTwo": {
                    "agree": "Tick here to confirm you have read and understood the <a href=\"#\">terms and conditions</a> for the purchase of this travel insurance policy",
                    "links": "<ul><li><a href=\"#\">Are you eligable to buy our insurance?</a></li><li><a href=\"#\">Further information on existing medical conditions</a></li><li><a href=\"#\">View policy limits and full policy wording</a></li></ul>",
                    "terms": "TRAVEL INSURANCE: Thomas Cook Retail Limited is an Appointed Representative of White Horse Insurance Ireland Limited which is authorised and regulated by the Central Bank of Ireland. Thomas Cook Travel Insurance is underwritten by White Horse Insurance Ireland Limited. For more information visit <a href=\"#\">Central Bank of Ireland</a> website."
                }
            }
        }
    },
    "myaccount":{
        "alerts" : {
          "forgottenPassEmailFail" : {
            "title": "email not sent",
            "content": "unfortunately a server error has prevented us from sending a reset email"
          },
          "userEmailNonexistant" : {
            "title": "Sorry, no accounts are associated with the email address you entered. Please try again.",
            "content": "Your username or password was not recognised. If you have forgotten your password, you can reset it below."
          },
          "userConfirmationEmailSent" : {
            "title": "Email has been sent",
            "content": "Please check your inbox for the confirm email. This could be on your junk folder."
          },
          "userSignupError" : {
            "title": "Error on Signup",
            "content": "There has been an error on the signup process. Please try again later."
          },
          "userAlreadyExists" : {
            "title": "Error on Signup",
            "content": "The user already exists."
          },
          "userSignupTerms" : {
            "title": "Terms And Conditions",
            "content": "Please accept the Terms and Conditions to proceed."
          },
          "logInError401" : {
            "title": "Sorry, no accounts are associated with the email address you entered. Please try again.",
            "content": "Your username or password was not recognised. If you have forgotten your password, you can reset it below."
          },
          "logInError430" : {
            "title": "Non-confirmed account",
            "content": "Your account needs to be confirmed, this can be done via the email sent after your registration"
          },
          "activationSuccess" : {
            "title": "Email has been sent",
            "content": "Please check your inbox for the confirmation email. This could be in your junk folder"
          },
          "activationError400" : {
            "title": "Email Not Sent",
            "content": "Unfortunately a server error has prevented us from sending an activation email."
          },
          "activationError500" : {
            "title": "Account Doesn\u0027t Exist",
            "content": "Please try signing up for a new account"
          },
          "unknownError" : {
            "title": "Sorry, an unexpected exception occurred",
            "content": "Please refresh page and try again"
          },
          "sendPasswordReset" : {
            "title": "Please follow the instructions in the email we sent to you to reset your password",
            "content": "You should receive an email to this account\u0027s registered address, if it exists. Follow the instructions to reset your password"
          },
          "ErrorSendPasswordReset" : {
            "title": "Sorry, no accounts are associated with the email address you entered. Please try again.",
            "content": "Unfortunately an error has occurred that has prevented us from sending a reset email"
          }
        },
        "sidebar":{
            "myAccountMenu":"My Account menu",
            "myHome":"My home",
            "myWishlist":"My Wish List",
            "myDetails":"My details",
            "myPreferences":"My Preferences",
            "mySupport":"Customer Support",
            "logout":"Logout"
        },
        "loginWidget":{
            "head":{
                "login":"Login",
                "signUp":"Signup",
                "myAccount":"My Account",
                "signOut":"Sign Out"
            },
            "saveMyWishlist":"Save My Wish List",
            "emailMyWishlist":"Email My Wish List",
            "myAccount":"My Account",
            "email":"Email Address",
            "emailDescription":"Enter your email address",
            "emailInvalid":"Please enter a valid email address",
            "IhaveAnAccount":"I have an account",
            "IamNew":"I'm new here!",
            "password":"Password",
            "enterPassword":"Enter your password",
            "fieldRequired":"This field is required.",
            "enterPasswordError":"Password must contains one upper, one lower and one number.",
            "enter8Character":"Please enter at least 8 characters.",
            "login":"Let's Go",
            "confirmPassword":"Confirm Password",
            "confirmPasswordDescription":"Confirm your password",
            "passwordDontMatch":"Password doesn't match.",
            "notANumber":"Please enter a valid phone number",
            "termsConditions":"I have read and agree to the Site Terms & Conditions",
            "policy1":"By creating an account with us, you accept our",
            "policy2":"Site Terms & Conditions",
            "policy3":"and",
            "policy4":"Privacy Policy",
            "signUp":"Sign Up",
            "emailForgottenPassword":"Enter the email address associated with your My Account, then click Send. We'll send you an email with the link to the page where you can easily reset your password.",
            "forgottenPassword":"Forgotten password?",
            "name" : "Name",
            "sendToMe" : "Send a copy of the email to my address",
            "enterMessage" : "Enter the message for the recipient",
            "enterName" : "Enter the name of the recipient",
            "enterEmail" : "Enter the email the recipient",
            "message" : "Message",
            "send":"Send",
            "save":"Save"
        },
        "resetpassword":{
            "problem":"There was a problem",
            "tryAgain":"Please try again, and if the problem persists please contact Thomas Cook support.",
            "success":"Success",
            "passwordSuccess":"Your password has been successfully reset, you can now",
            "saveWishlist":"Save My Wish List",
            "login":"login",
            "usingNewPassword":"using your new password.",
            "myAccount":"My Account",
            "passwordReset":"Password Reset",
            "emailAddress":"Email Address",
            "newPassword":"New Password",
            "enterNewPassword":"Enter New Password",
            "fieldRequired":"This field is required.",
            "enterValidPassword":"Please enter a valid password.",
            "atLeast8Characters":"Please enter at least 8 characters.",
            "confirmNewPassword":"Confirm New Password",
            "reenterNewPassword":"Re-Enter New Password",
            "passwordDontMatch":"Password doesn't match.",
            "reset":"Reset",
            "signDifferentAccount":"Sign in a different account",
            "registerAccount": "Register My Account",
            "registerButton": "Register"
        },
        "index":{
            "welcome1":"Welcome",
            "welcome2":"My Account",
            "blurb":"The online holiday hub designed to make choosing and booking your next Thomas Cook getaway effortless.",
            "blurb2":"Keep track of all the hotels that caught your eye on our site through our wishlist feature and store your details on your My Details page to speed up your bookings in future.",
            "dreamHoliday":"Your dream holiday is just a click away...",
            "createWishlist":"Create My Wish List",
            "updateDetails":"Update your details...",
            "whatsInside1":"What's inside",
            "whatsInside2":"My Account?",
            "options":{
                "wishlist":"Your saved Wishlist",
                "faster":"Faster bookings",
                "upgrades":"Upgrades & Special offers",
                "speedy":"Speedy Check-in",
                "more":"Plus much more!"
            }
        },
        "wishlist": {
            "back":"back",
            "emailWishlist":"Email My Wish List",
            "youhave":"You have",
            "wishlistHolidays":"Wish List",
            "wishlistHolidays2":"holiday",
            "clearAll":"Clear all",
            "addHolidays":"Add holidays to My Wish List",
            "clickCompare":"Click compare to add a holiday",
            "Nights":"Nights",
            "nights":"nights",
            "included":"Included",
            "includedHoliday":"Included in your final holiday price",
            "facilities":"Facilities",
            "location":"Location",
            "tripAdvisorRating": "TripAdvisor Traveller Rating",
            "basedOn":"Based on",
            "reviews":"reviews",
            "thomasCookCustomer":"Thomas Cook customer rating",
            "Rooms":"Rooms",
            "adults":"adults",
            "children":"children",
            "boardBasi":"Board Basis",
            "outboundFlight":"Outbound Flight",
            "inboundFlight":"Inbound Flight",
            "transfer":"Transfer",
            "details":"Details",
            "saveWishlist":"Add To Wish List",
            "remove":"Remove",
            "limitPopupTitle":"You have selected the maximum number of Wish List items.",
            "liimitPopupMessage":"Please remove a saved item first before adding any further holidays.",
            "alerts": {
                "noAvailability":{
                    "title":"This holiday is no longer available.",
                    "content":"Unfortunatley we do not have any available dates for this holiday.",
                    "name":"Remove from Wishlist"
                },
                "noDetails":{
                    "title":"Cannot load details for this holiday.",
                    "content":"Please try again later.",
                    "name":""
                },
                "maxedComparisons":{
                    "title":"You have selected the maximum number of compare items.",
                    "content":"You can remove an item from compare by clicking grey compared button.",
                    "name":"OK"
                },
                "clearWishlist":{
                    "title": "Wishlist Removal",
                    "content": "Are you sure you want to remove all the saved wishlist items?",
                    "cancel": "Cancel",
                    "remove": "Remove"
                }
            }
        },
        "details":{
            "myDetails":"My Details",
            "description":"Complete your profile and speed through the booking process - you can of course update these at any time you wish. Share and exchange photos of your favourite hotels or even brag about the resort you’re headed to, by linking your profile to your Facebook, Twitter or Google + account.",
            "myPersonalDetails":"My personal details",
            "title":"Title",
            "selectTitle":"Select title",
            "fullName":"Full Name",
            "firstName":"First Name(s)",
            "surname":"Surname",
            "security":"For security reasons, you can't change your name without contacting customer services with supporting evidence e.g. photocopy of marriage certificate or passport photo page",
            "dateOfBirth":"Date of Birth",
            "day":"Day",
            "month":"Month",
            "year":"Year",
            "postcode":"Postcode",
            "findAddress":"Find address",
            "enterAddressManually":"Enter address manually",
            "selected":"Select from list of returned addresses",
            "streetAddress":"Street Address",
            "firstAddress":"First line of address",
            "secondAddress":"Second line of address",
            "country":"Country",
            "countryDescription":"United Kingdom",
            "countryCode":"Country Code",
            "phoneNumber":"Phone Number",
            "yourPhoneNumber":"Your phone number",
            "mobileNumber":"Mobile Number",
            "myAccountSettings":"My Account settings",
            "emailAddress":"Email Address",
            "change":"Change",
            "password":"Password",
            "requiredField":"This field is required.",
            "validPassword":"Please enter a valid password",
            "atLeast8Characters":"Please enter at least 8 characters.",
            "confirmPassword":"Confirm Password",
            "passwordDontMatch":"Password doesn't match.",
            "notANumber":"Please enter a valid phone number",
            "cancelChanges":"Cancel changes",
            "saveChanges":"Save changes",
            "alerts" : {
                "success": {
                    "title":"Success!",
                    "content":"Your details have been saved."
                },
                "noData": {
                    "title": "Sorry, we were unable to load your details.",
                    "content": "Please refresh page and try again."
                },
                "loggedOut": {
                    "title":"Sorry, it appears you are not logged in",
                    "content":"Please log in and try again"
                },
                "unknownError":{
                    "title":"Sorry, an unexpected exception occurred",
                    "content":"Please refresh page and try again"
                }
            }
        },
        "preference": {
            "myPreference":"My Preferences",
            "switchHoliday":"Switch into holiday mode! Use the button switches below to receive your weekly dose of sunshine straight into your e-mail inbox from our Thomas Cook extras.",
            "subcriptions":"My personal details",
            "tuesdayInspiration":"Tuesday Inspiration",
            "weekly":"Weekly",
            "toggle":"toggle",
            "latestPrices":"The latest prices in your favorite cities, top deals in dream destinations and personalised recommendations. Get inspired!",
            "bookingAssistant":"Your Booking Assistant",
            "duringBooking":"During your booking",
            "planYourTrip":"Plan your trip with hand-picked deals and notifications from our travel experts. Let us make booking even easier.",
            "justDeals":"Just Deals",
            "everyFriday":"Every Friday we’ll send you our biggest and best discounts",
            "lazySundays":"Lazy Sunday",
            "lazySundaysText":"No need to rush - our Lazy Sunday edition includes subscriber-only deals, promotional offers and unpdates on our newest features.",
            "cancelChanges":"Cancel changes",
            "saveChanges":"Save changes"
        },
        "support":{
            "customer":"Customer Support",
            "blurb":"You should be able to find all the information you need on our website. However, if you need any extra support with your holiday choice or how to use our site then please contact our dedicated team online via live chat (here for you 9am - 6pm daily) or via email.",
            "help":"Help when you need it...",
            "holiday":"Your next holiday",
            "manage":"Manage",
            "livechat":"Live Chat",
            "talk":"Talk to us",
            "callUs": "Call Us",
            "writetous":"Write to us",
            "emailus":"Email us",
            "storelocator":"Store locator",
            "findus":"Find Us"
        },
        "widget":{
            "state":{
                "myAccount":"My Account",
                "forgottenPassword":"Forgotten Password"
            },
            "forgottenPassEmailFail": {
                "title": "Email not sent.",
                "content": "Unfortunately a server error has prevented us from sending a reset email.",
                "name": "Resend email"
            },
            "userEmailNonexistant": {
                "title":"Sorry, no accounts are associated with the email address you entered. Please try again.",
                "content":"Your username or password was not recognised. If you have forgotten your password, you can reset it below.",
                "name":"Sign up"
            },
            "userConfirmationEmailSent": {
                "title":"Email has been sent",
                "content":"Please check your inbox for the confirm email. This could be on your junk folder.",
                "name":"Sign up"
            },
            "userSignupError": {
                "title":"Error on Signup ",
                "content":"There has been an error on the signup process. Please try again later. ",
                "name":"Sign up"
            },
            "userAlreadyExists": {
                "title":"Error on Signup.",
                "content":"The user already exists.",
                "name":"Sign up"
            },
            "userSignupTerms": {
                "title":"Terms And Conditions ",
                "content":"Please accept the Terms and Conditions to proceed. ",
                "name":"Sign up"
            },
            "logInError-401": {
                "title":"Sorry, no accounts are associated with the email address you entered. Please try again. ",
                "content":"Your username or password was not recognised. If you have forgotten your password, you can reset it below. ",
                "name":"Non-confirmed account"
            },
            "logInError-430": {
                "title":"Non-confirmed account",
                "content":"Your account needs to be confirmed, this can be done via the email sent after your registration.",
                "name":"Resend email"
            },
            "activationSuccess": {
                "title":"Email has been sent",
                "content":"Please check your inbox for the confirmation email. This could be in your junk folder.",
                "name":"Email Not Sent "
            },
            "activationError-400": {
                "title":"Email Not Sent.",
                "content":"Unfortunately a server error has prevented us from sending an activation email.",
                "name":"Resend email"
            },
            "activationError-500": {
                "title":"Account Doesn't Exist.",
                "content":"Please try signing up for a new account."
            },
            "unknownError": {
                "title":"Sorry, an unexpected exception occurred",
                "content":"Please refresh page and try again "
            },
            "sendPasswordReset": {
                "title":"Please follow the instructions in the email we sent to you to reset your password.",
                "content":"You should receive an email to this account's registered address, if it exists. Follow the instructions to reset your password."
            },
            "ErrorSendPasswordReset": {
                "title":"Sorry, no accounts are associated with the email address you entered. Please try again.",
                "content":"Unfortunatley an error has occured that has prevented us from sending a reset email"
            }
        },
        "activation":{
            "title":"Account Activated",
            "header":"There was a problem activating your account"
        },
        "login": {
            "header":"My Account",
            "activationError":"There was a problem activating your account",
            "success":"Success, your details have been saved.",
            "emailAddress":"Email Address",
            "passwordMust5Digits":"Password must be more than 5 digits.",
            "forgottenPassword":"Forgotten password",
            "signInDifferentAccount":"Sign in a different account",
            "associatedEmail":"Enter the email address associated with your My Account, then click Send. We'll send you an email with the link to the page where you can easily reset your password.",
            "passwordRequired":"Password is required.",
            "forgottenPasswordQuestion":"Forgotten password?",
            "send":"Send",
            "tryAgain" : "Please try again, and if the problem persists please contact Thomas Cook support.",
            "placeHolder" : {
                "emailAddress":"Enter your email address",
                "enterEmailAddress":"Enter your email address",
                "enterPassword":"Enter Password"
            }
        },
        "myBookings":"This is the mybookings view"
    }
}""")

  val jsonRA1 = parse("""{
    "prop-only-a" : "val1"
}""")
  val jsonRA2 = parse("""{
    "prop-only-a" : {
        "nested-only-a": "a"
    },
    "almost-common" : {
        "val a" : "a"
    }
}""")
  val jsonRA3 = parse("""{"common": {
    "home": "Home"
}, "search": {
    "seoHolidaysFound": "{0} holidays found"
}, "accom": {
    "noDataForDatesInPriceList": "Error we don't have a match in our data for dates in the price list"
}, "checkout": {
    "payment": {
        "error": {
            "expiryMonth": "The expiry month is empty, please review and amend"
        }
    }
}, "customise": {
    "extras": {
        "viewInflightMenuLink": "View our in-flight menu",
        "CYS": {
            "includedMessage": "Choose your seat is already included."
        },
        "IFM": {
            "footerDescription": "<em>Created by James Martin. Only on Thomas Cook</em>"
        }
    }
}, "myaccount": {
    "alerts": {
        "emailWishlist-success": {
            "title": "Email has been sent",
            "content": "If you have sent the email to yourself please check your inbox. This could be in your junk folder."
        }
    }
}}""")

  val jsonRB1 = parse("""{
    "prop-only-b" : "val2"
}""")
  val jsonRB2 = parse("""{
    "prop-only-b" : {
        "nested-only-b": "b"
    },
    "almost-common" : {
        "val b" : "b"
    }
}""")
  val jsonRB3 = parse("""{"checkout": {
    "payment": {
        "error": {
            "expriyMonth": "The expiry month is empty, please review and amend"
        }
    }
}}""")

}