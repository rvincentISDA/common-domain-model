package org.isda.cdm.functions;

import org.isda.cdm.DeterminationMethodEnum;
import org.isda.cdm.TimeTypeEnum;
import org.isda.cdm.TimeZone.TimeZoneBuilder;

public class ResolveTimeZoneFromTimeTypeImpl extends ResolveTimeZoneFromTimeType {
	
	@Override
	protected TimeZoneBuilder doEvaluate(TimeTypeEnum timeType, DeterminationMethodEnum determinationMethod) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub");
	}
}
