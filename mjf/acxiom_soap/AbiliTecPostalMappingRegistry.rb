require 'AbiliTecPostal.rb'
require 'soap/mapping'

module AbiliTecPostalMappingRegistry
  EncodedRegistry = ::SOAP::Mapping::EncodedRegistry.new
  LiteralRegistry = ::SOAP::Mapping::LiteralRegistry.new
  NsC_10 = "http://id.acxiom.com/abilitec-postal/1.0"

  EncodedRegistry.register(
    :class => CleanAddress,
    :schema_type => XSD::QName.new(NsC_10, "cleanAddress"),
    :schema_element => [
      ["postalInput_1", ["PostalInput", XSD::QName.new(nil, "PostalInput_1")]]
    ]
  )

  EncodedRegistry.register(
    :class => PostalInput,
    :schema_type => XSD::QName.new(NsC_10, "PostalInput"),
    :schema_element => [
      ["addresses", ["UnparsedAddress[]", XSD::QName.new(nil, "addresses")], [0, nil]],
      ["options", ["PostalOptions", XSD::QName.new(nil, "options")]]
    ]
  )

  EncodedRegistry.register(
    :class => UnparsedAddress,
    :schema_type => XSD::QName.new(NsC_10, "UnparsedAddress"),
    :schema_element => [
      ["addressLines", ["SOAP::SOAPString[]", XSD::QName.new(nil, "addressLines")], [0, nil]],
      ["city", ["SOAP::SOAPString", XSD::QName.new(nil, "city")]],
      ["postalCode", ["SOAP::SOAPString", XSD::QName.new(nil, "postalCode")]],
      ["state", ["SOAP::SOAPString", XSD::QName.new(nil, "state")]],
      ["urbanization", ["SOAP::SOAPString", XSD::QName.new(nil, "urbanization")]]
    ]
  )

  EncodedRegistry.register(
    :class => PostalOptions,
    :schema_type => XSD::QName.new(NsC_10, "PostalOptions"),
    :schema_element => [
      ["useLACSLink", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "useLACSLink")]]
    ]
  )

  EncodedRegistry.register(
    :class => CleanAddressResponse,
    :schema_type => XSD::QName.new(NsC_10, "cleanAddressResponse"),
    :schema_element => [
      ["result", ["PostalOutput[]", XSD::QName.new(nil, "result")], [0, nil]]
    ]
  )

  EncodedRegistry.register(
    :class => PostalOutput,
    :schema_type => XSD::QName.new(NsC_10, "PostalOutput"),
    :schema_element => [
      ["addressAbility", ["AddressAbility", XSD::QName.new(nil, "addressAbility")]],
      ["deliveryPointValidation", ["DeliveryPointValidation", XSD::QName.new(nil, "deliveryPointValidation")]],
      ["lacsFlag", ["SOAP::SOAPString", XSD::QName.new(nil, "lacsFlag")]],
      ["lineOfTravel", ["SOAP::SOAPString", XSD::QName.new(nil, "lineOfTravel")]],
      ["parsedAddress", ["ParsedAddress", XSD::QName.new(nil, "parsedAddress")]]
    ]
  )

  EncodedRegistry.register(
    :class => AddressAbility,
    :schema_type => XSD::QName.new(NsC_10, "AddressAbility"),
    :schema_element => [
      ["addressNotFound", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "addressNotFound")]],
      ["aliasMatch", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "aliasMatch")]],
      ["alternateAddress", ["SOAP::SOAPString", XSD::QName.new(nil, "alternateAddress")]],
      ["alternateAddressMatch", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "alternateAddressMatch")]],
      ["carrierRouteId", ["SOAP::SOAPString", XSD::QName.new(nil, "carrierRouteId")]],
      ["cityAbbreviation", ["SOAP::SOAPString", XSD::QName.new(nil, "cityAbbreviation")]],
      ["correctedCityAndOrState", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "correctedCityAndOrState")]],
      ["correctedPrimaryAddress", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "correctedPrimaryAddress")]],
      ["correctedSecondaryAddress", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "correctedSecondaryAddress")]],
      ["countyCode", ["SOAP::SOAPString", XSD::QName.new(nil, "countyCode")]],
      ["deliveryPointBarCode", ["SOAP::SOAPString", XSD::QName.new(nil, "deliveryPointBarCode")]],
      ["earlyWarningSystemMatch", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "earlyWarningSystemMatch")]],
      ["failureToMatchLastAddressLine", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "failureToMatchLastAddressLine")]],
      ["financeNumber", ["SOAP::SOAPString", XSD::QName.new(nil, "financeNumber")]],
      ["mainCity", ["SOAP::SOAPString", XSD::QName.new(nil, "mainCity")]],
      ["mainState", ["SOAP::SOAPString", XSD::QName.new(nil, "mainState")]],
      ["match", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "match")]],
      ["missingPoBoxNumber", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "missingPoBoxNumber")]],
      ["missingRuralRouteHcBoxNumber", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "missingRuralRouteHcBoxNumber")]],
      ["missingSecondaryNumberInHighrise", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "missingSecondaryNumberInHighrise")]],
      ["missingStreetNumber", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "missingStreetNumber")]],
      ["multipleMatchMissingIncorrectDirection", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "multipleMatchMissingIncorrectDirection")]],
      ["multipleMatchMissingIncorrectSuffix", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "multipleMatchMissingIncorrectSuffix")]],
      ["multipleMatchPrimaryAddressField", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "multipleMatchPrimaryAddressField")]],
      ["multipleMatchSecondaryAddressField", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "multipleMatchSecondaryAddressField")]],
      ["noSuchPrimaryNumber", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "noSuchPrimaryNumber")]],
      ["poBoxNumberNotOnFile", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "poBoxNumberNotOnFile")]],
      ["recordTypeCode", ["SOAP::SOAPString", XSD::QName.new(nil, "recordTypeCode")]],
      ["returnCode", ["SOAP::SOAPString", XSD::QName.new(nil, "returnCode")]],
      ["ruralRouteHcBoxNotOnFile", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "ruralRouteHcBoxNotOnFile")]],
      ["secondaryNumberNotFound", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "secondaryNumberNotFound")]],
      ["zipCodeChanged", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "zipCodeChanged")]]
    ]
  )

  EncodedRegistry.register(
    :class => DeliveryPointValidation,
    :schema_type => XSD::QName.new(NsC_10, "DeliveryPointValidation"),
    :schema_element => [
      ["accurateSource", ["SOAP::SOAPString", XSD::QName.new(nil, "accurateSource")]],
      ["addressNotFound", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "addressNotFound")]],
      ["aliasMatch", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "aliasMatch")]],
      ["alternateAddressMatch", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "alternateAddressMatch")]],
      ["commercialMailReceivingAgency", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "commercialMailReceivingAgency")]],
      ["correctedCityAndOrState", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "correctedCityAndOrState")]],
      ["correctedPrimaryAddress", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "correctedPrimaryAddress")]],
      ["correctedSecondaryAddress", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "correctedSecondaryAddress")]],
      ["deliverability", ["SOAP::SOAPString", XSD::QName.new(nil, "deliverability")]],
      ["earlyWarningSystemMatch", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "earlyWarningSystemMatch")]],
      ["failureToMatchLastAddressLine", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "failureToMatchLastAddressLine")]],
      ["match", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "match")]],
      ["missingPoBoxNumber", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "missingPoBoxNumber")]],
      ["missingRuralRouteHcBoxNumber", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "missingRuralRouteHcBoxNumber")]],
      ["missingSecondaryNumber", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "missingSecondaryNumber")]],
      ["missingStreetNumber", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "missingStreetNumber")]],
      ["multipleMatchMissingIncorrectDirection", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "multipleMatchMissingIncorrectDirection")]],
      ["multipleMatchMissingIncorrectSuffix", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "multipleMatchMissingIncorrectSuffix")]],
      ["multipleMatchPrimaryAddressField", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "multipleMatchPrimaryAddressField")]],
      ["multipleMatchSecondaryAddressField", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "multipleMatchSecondaryAddressField")]],
      ["noSuchPrimaryNumber", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "noSuchPrimaryNumber")]],
      ["poBoxNumberNotOnFile", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "poBoxNumberNotOnFile")]],
      ["ruralRouteHcBoxNotOnFile", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "ruralRouteHcBoxNotOnFile")]],
      ["secondaryNumberNotFound", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "secondaryNumberNotFound")]],
      ["streetFrontMatch", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "streetFrontMatch")]],
      ["zipCodeChanged", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "zipCodeChanged")]]
    ]
  )

  EncodedRegistry.register(
    :class => ParsedAddress,
    :schema_type => XSD::QName.new(NsC_10, "ParsedAddress"),
    :schema_element => [
      ["city", ["SOAP::SOAPString", XSD::QName.new(nil, "city")]],
      ["locality", ["SOAP::SOAPString", XSD::QName.new(nil, "locality")]],
      ["postOfficeBox", ["SOAP::SOAPString", XSD::QName.new(nil, "postOfficeBox")]],
      ["postalCode", ["SOAP::SOAPString", XSD::QName.new(nil, "postalCode")]],
      ["state", ["SOAP::SOAPString", XSD::QName.new(nil, "state")]],
      ["streetInfo", ["StreetInfo", XSD::QName.new(nil, "streetInfo")]],
      ["unit", ["SOAP::SOAPString", XSD::QName.new(nil, "unit")]],
      ["unitDescription", ["SOAP::SOAPString", XSD::QName.new(nil, "unitDescription")]]
    ]
  )

  EncodedRegistry.register(
    :class => StreetInfo,
    :schema_type => XSD::QName.new(NsC_10, "StreetInfo"),
    :schema_element => [
      ["name", ["SOAP::SOAPString", XSD::QName.new(nil, "name")]],
      ["number", ["SOAP::SOAPString", XSD::QName.new(nil, "number")]],
      ["postDirection", ["SOAP::SOAPString", XSD::QName.new(nil, "postDirection")]],
      ["preDirection", ["SOAP::SOAPString", XSD::QName.new(nil, "preDirection")]],
      ["suffix", ["SOAP::SOAPString", XSD::QName.new(nil, "suffix")]]
    ]
  )

  EncodedRegistry.register(
    :class => InputLimitException,
    :schema_type => XSD::QName.new(NsC_10, "InputLimitException"),
    :schema_element => [
      ["message", ["SOAP::SOAPString", XSD::QName.new(nil, "message")]]
    ]
  )

  EncodedRegistry.register(
    :class => InputValidationException,
    :schema_type => XSD::QName.new(NsC_10, "InputValidationException"),
    :schema_element => [
      ["message", ["SOAP::SOAPString", XSD::QName.new(nil, "message")]]
    ]
  )

  EncodedRegistry.register(
    :class => SystemUnavailableException,
    :schema_type => XSD::QName.new(NsC_10, "SystemUnavailableException"),
    :schema_element => [
      ["message", ["SOAP::SOAPString", XSD::QName.new(nil, "message")]]
    ]
  )

  LiteralRegistry.register(
    :class => CleanAddress,
    :schema_type => XSD::QName.new(NsC_10, "cleanAddress"),
    :schema_element => [
      ["postalInput_1", ["PostalInput", XSD::QName.new(nil, "PostalInput_1")]]
    ]
  )

  LiteralRegistry.register(
    :class => PostalInput,
    :schema_type => XSD::QName.new(NsC_10, "PostalInput"),
    :schema_element => [
      ["addresses", ["UnparsedAddress[]", XSD::QName.new(nil, "addresses")], [0, nil]],
      ["options", ["PostalOptions", XSD::QName.new(nil, "options")]]
    ]
  )

  LiteralRegistry.register(
    :class => UnparsedAddress,
    :schema_type => XSD::QName.new(NsC_10, "UnparsedAddress"),
    :schema_element => [
      ["addressLines", ["SOAP::SOAPString[]", XSD::QName.new(nil, "addressLines")], [0, nil]],
      ["city", ["SOAP::SOAPString", XSD::QName.new(nil, "city")]],
      ["postalCode", ["SOAP::SOAPString", XSD::QName.new(nil, "postalCode")]],
      ["state", ["SOAP::SOAPString", XSD::QName.new(nil, "state")]],
      ["urbanization", ["SOAP::SOAPString", XSD::QName.new(nil, "urbanization")]]
    ]
  )

  LiteralRegistry.register(
    :class => PostalOptions,
    :schema_type => XSD::QName.new(NsC_10, "PostalOptions"),
    :schema_element => [
      ["useLACSLink", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "useLACSLink")]]
    ]
  )

  LiteralRegistry.register(
    :class => CleanAddressResponse,
    :schema_type => XSD::QName.new(NsC_10, "cleanAddressResponse"),
    :schema_element => [
      ["result", ["PostalOutput[]", XSD::QName.new(nil, "result")], [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => PostalOutput,
    :schema_type => XSD::QName.new(NsC_10, "PostalOutput"),
    :schema_element => [
      ["addressAbility", ["AddressAbility", XSD::QName.new(nil, "addressAbility")]],
      ["deliveryPointValidation", ["DeliveryPointValidation", XSD::QName.new(nil, "deliveryPointValidation")]],
      ["lacsFlag", ["SOAP::SOAPString", XSD::QName.new(nil, "lacsFlag")]],
      ["lineOfTravel", ["SOAP::SOAPString", XSD::QName.new(nil, "lineOfTravel")]],
      ["parsedAddress", ["ParsedAddress", XSD::QName.new(nil, "parsedAddress")]]
    ]
  )

  LiteralRegistry.register(
    :class => AddressAbility,
    :schema_type => XSD::QName.new(NsC_10, "AddressAbility"),
    :schema_element => [
      ["addressNotFound", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "addressNotFound")]],
      ["aliasMatch", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "aliasMatch")]],
      ["alternateAddress", ["SOAP::SOAPString", XSD::QName.new(nil, "alternateAddress")]],
      ["alternateAddressMatch", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "alternateAddressMatch")]],
      ["carrierRouteId", ["SOAP::SOAPString", XSD::QName.new(nil, "carrierRouteId")]],
      ["cityAbbreviation", ["SOAP::SOAPString", XSD::QName.new(nil, "cityAbbreviation")]],
      ["correctedCityAndOrState", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "correctedCityAndOrState")]],
      ["correctedPrimaryAddress", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "correctedPrimaryAddress")]],
      ["correctedSecondaryAddress", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "correctedSecondaryAddress")]],
      ["countyCode", ["SOAP::SOAPString", XSD::QName.new(nil, "countyCode")]],
      ["deliveryPointBarCode", ["SOAP::SOAPString", XSD::QName.new(nil, "deliveryPointBarCode")]],
      ["earlyWarningSystemMatch", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "earlyWarningSystemMatch")]],
      ["failureToMatchLastAddressLine", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "failureToMatchLastAddressLine")]],
      ["financeNumber", ["SOAP::SOAPString", XSD::QName.new(nil, "financeNumber")]],
      ["mainCity", ["SOAP::SOAPString", XSD::QName.new(nil, "mainCity")]],
      ["mainState", ["SOAP::SOAPString", XSD::QName.new(nil, "mainState")]],
      ["match", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "match")]],
      ["missingPoBoxNumber", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "missingPoBoxNumber")]],
      ["missingRuralRouteHcBoxNumber", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "missingRuralRouteHcBoxNumber")]],
      ["missingSecondaryNumberInHighrise", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "missingSecondaryNumberInHighrise")]],
      ["missingStreetNumber", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "missingStreetNumber")]],
      ["multipleMatchMissingIncorrectDirection", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "multipleMatchMissingIncorrectDirection")]],
      ["multipleMatchMissingIncorrectSuffix", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "multipleMatchMissingIncorrectSuffix")]],
      ["multipleMatchPrimaryAddressField", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "multipleMatchPrimaryAddressField")]],
      ["multipleMatchSecondaryAddressField", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "multipleMatchSecondaryAddressField")]],
      ["noSuchPrimaryNumber", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "noSuchPrimaryNumber")]],
      ["poBoxNumberNotOnFile", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "poBoxNumberNotOnFile")]],
      ["recordTypeCode", ["SOAP::SOAPString", XSD::QName.new(nil, "recordTypeCode")]],
      ["returnCode", ["SOAP::SOAPString", XSD::QName.new(nil, "returnCode")]],
      ["ruralRouteHcBoxNotOnFile", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "ruralRouteHcBoxNotOnFile")]],
      ["secondaryNumberNotFound", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "secondaryNumberNotFound")]],
      ["zipCodeChanged", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "zipCodeChanged")]]
    ]
  )

  LiteralRegistry.register(
    :class => DeliveryPointValidation,
    :schema_type => XSD::QName.new(NsC_10, "DeliveryPointValidation"),
    :schema_element => [
      ["accurateSource", ["SOAP::SOAPString", XSD::QName.new(nil, "accurateSource")]],
      ["addressNotFound", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "addressNotFound")]],
      ["aliasMatch", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "aliasMatch")]],
      ["alternateAddressMatch", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "alternateAddressMatch")]],
      ["commercialMailReceivingAgency", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "commercialMailReceivingAgency")]],
      ["correctedCityAndOrState", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "correctedCityAndOrState")]],
      ["correctedPrimaryAddress", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "correctedPrimaryAddress")]],
      ["correctedSecondaryAddress", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "correctedSecondaryAddress")]],
      ["deliverability", ["SOAP::SOAPString", XSD::QName.new(nil, "deliverability")]],
      ["earlyWarningSystemMatch", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "earlyWarningSystemMatch")]],
      ["failureToMatchLastAddressLine", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "failureToMatchLastAddressLine")]],
      ["match", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "match")]],
      ["missingPoBoxNumber", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "missingPoBoxNumber")]],
      ["missingRuralRouteHcBoxNumber", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "missingRuralRouteHcBoxNumber")]],
      ["missingSecondaryNumber", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "missingSecondaryNumber")]],
      ["missingStreetNumber", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "missingStreetNumber")]],
      ["multipleMatchMissingIncorrectDirection", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "multipleMatchMissingIncorrectDirection")]],
      ["multipleMatchMissingIncorrectSuffix", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "multipleMatchMissingIncorrectSuffix")]],
      ["multipleMatchPrimaryAddressField", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "multipleMatchPrimaryAddressField")]],
      ["multipleMatchSecondaryAddressField", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "multipleMatchSecondaryAddressField")]],
      ["noSuchPrimaryNumber", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "noSuchPrimaryNumber")]],
      ["poBoxNumberNotOnFile", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "poBoxNumberNotOnFile")]],
      ["ruralRouteHcBoxNotOnFile", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "ruralRouteHcBoxNotOnFile")]],
      ["secondaryNumberNotFound", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "secondaryNumberNotFound")]],
      ["streetFrontMatch", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "streetFrontMatch")]],
      ["zipCodeChanged", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "zipCodeChanged")]]
    ]
  )

  LiteralRegistry.register(
    :class => ParsedAddress,
    :schema_type => XSD::QName.new(NsC_10, "ParsedAddress"),
    :schema_element => [
      ["city", ["SOAP::SOAPString", XSD::QName.new(nil, "city")]],
      ["locality", ["SOAP::SOAPString", XSD::QName.new(nil, "locality")]],
      ["postOfficeBox", ["SOAP::SOAPString", XSD::QName.new(nil, "postOfficeBox")]],
      ["postalCode", ["SOAP::SOAPString", XSD::QName.new(nil, "postalCode")]],
      ["state", ["SOAP::SOAPString", XSD::QName.new(nil, "state")]],
      ["streetInfo", ["StreetInfo", XSD::QName.new(nil, "streetInfo")]],
      ["unit", ["SOAP::SOAPString", XSD::QName.new(nil, "unit")]],
      ["unitDescription", ["SOAP::SOAPString", XSD::QName.new(nil, "unitDescription")]]
    ]
  )

  LiteralRegistry.register(
    :class => StreetInfo,
    :schema_type => XSD::QName.new(NsC_10, "StreetInfo"),
    :schema_element => [
      ["name", ["SOAP::SOAPString", XSD::QName.new(nil, "name")]],
      ["number", ["SOAP::SOAPString", XSD::QName.new(nil, "number")]],
      ["postDirection", ["SOAP::SOAPString", XSD::QName.new(nil, "postDirection")]],
      ["preDirection", ["SOAP::SOAPString", XSD::QName.new(nil, "preDirection")]],
      ["suffix", ["SOAP::SOAPString", XSD::QName.new(nil, "suffix")]]
    ]
  )

  LiteralRegistry.register(
    :class => InputLimitException,
    :schema_type => XSD::QName.new(NsC_10, "InputLimitException"),
    :schema_element => [
      ["message", ["SOAP::SOAPString", XSD::QName.new(nil, "message")]]
    ]
  )

  LiteralRegistry.register(
    :class => InputValidationException,
    :schema_type => XSD::QName.new(NsC_10, "InputValidationException"),
    :schema_element => [
      ["message", ["SOAP::SOAPString", XSD::QName.new(nil, "message")]]
    ]
  )

  LiteralRegistry.register(
    :class => SystemUnavailableException,
    :schema_type => XSD::QName.new(NsC_10, "SystemUnavailableException"),
    :schema_element => [
      ["message", ["SOAP::SOAPString", XSD::QName.new(nil, "message")]]
    ]
  )

  LiteralRegistry.register(
    :class => CleanAddress,
    :schema_name => XSD::QName.new(NsC_10, "cleanAddress"),
    :schema_element => [
      ["postalInput_1", ["PostalInput", XSD::QName.new(nil, "PostalInput_1")]]
    ]
  )

  LiteralRegistry.register(
    :class => CleanAddressResponse,
    :schema_name => XSD::QName.new(NsC_10, "cleanAddressResponse"),
    :schema_element => [
      ["result", ["PostalOutput[]", XSD::QName.new(nil, "result")], [0, nil]]
    ]
  )

  LiteralRegistry.register(
    :class => SystemUnavailableException,
    :schema_name => XSD::QName.new(NsC_10, "SystemUnavailableException"),
    :schema_element => [
      ["message", ["SOAP::SOAPString", XSD::QName.new(nil, "message")]]
    ]
  )

  LiteralRegistry.register(
    :class => InputValidationException,
    :schema_name => XSD::QName.new(NsC_10, "InputValidationException"),
    :schema_element => [
      ["message", ["SOAP::SOAPString", XSD::QName.new(nil, "message")]]
    ]
  )

  LiteralRegistry.register(
    :class => InputLimitException,
    :schema_name => XSD::QName.new(NsC_10, "InputLimitException"),
    :schema_element => [
      ["message", ["SOAP::SOAPString", XSD::QName.new(nil, "message")]]
    ]
  )
end
