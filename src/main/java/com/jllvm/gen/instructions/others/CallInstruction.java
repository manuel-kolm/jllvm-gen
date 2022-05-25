package com.jllvm.gen.instructions.others;

import java.util.ArrayList;
import java.util.List;

import com.jllvm.gen.datatypes.DataType;
import com.jllvm.gen.enums.CallingConvention;
import com.jllvm.gen.enums.FastMathFlag;
import com.jllvm.gen.enums.TailFlag;
import com.jllvm.gen.instructions.BaseInstruction;

public class CallInstruction extends BaseInstruction {

	private DataType result;
	private String calleeFnName;
	private List<DataType> argumentTypes = new ArrayList<>();

	private TailFlag tailFlag;
	private FastMathFlag[] fastMathFlags;
	private CallingConvention callingConvention;

	public DataType getResult() {
		return result;
	}

	public void setResult(DataType result) {
		this.result = result;
	}

	public String getCalleeFnName() {
		return calleeFnName;
	}

	public void setCalleeFnName(String calleeFnName) {
		this.calleeFnName = calleeFnName;
	}

	public List<DataType> getArgumentTypes() {
		return argumentTypes;
	}

	public void setArgumentTypes(List<DataType> argumentTypes) {
		this.argumentTypes = argumentTypes;
	}

	public TailFlag getTailFlag() {
		return tailFlag;
	}

	public void setTailFlag(TailFlag tailFlag) {
		this.tailFlag = tailFlag;
	}

	public FastMathFlag[] getFastMathFlags() {
		return fastMathFlags;
	}

	public void setFastMathFlags(FastMathFlag[] fastMathFlags) {
		this.fastMathFlags = fastMathFlags;
	}

	public CallingConvention getCallingConvention() {
		return callingConvention;
	}

	public void setCallingConvention(CallingConvention callingConvention) {
		this.callingConvention = callingConvention;
	}

	@Override
	public String toString() {
		if (result.getFirstClassType() == null) {
			throw new RuntimeException("FirstClassType of result not defined.");
		}

		StringBuilder sb = (result != null)
				? new StringBuilder(result.getIdentifier() + " = ")
				: new StringBuilder();

		sb.append("call ") //
				.append(result.getFirstClassType()) //
				.append(" ") //
				.append(calleeFnName) //
				.append(" (");

		for (int i = 0; i < argumentTypes.size(); ++i) {
			DataType argumentType = argumentTypes.get(i);

			if (i == 0) {
				sb.append(", ");
			}

			sb.append(argumentType.getFirstClassType()) //
					.append(" ") //
					.append(argumentType.getIdentifierOrValue());
		}

		return sb.append(")").toString();
	}
}
