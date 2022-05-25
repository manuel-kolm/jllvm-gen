package com.jllvm.gen.instructions.terminator;

import com.jllvm.gen.datatypes.DataValue;
import com.jllvm.gen.instructions.BaseInstruction;
import com.jllvm.gen.types.LabelType;

public class BrInstruction {
	public class ConditionalBr extends BaseInstruction {
		private DataValue condition;
		private LabelType ifTrueLabelType;
		private LabelType ifFalseLabelType;

		public LabelType getIfTrueLabelType() {
			return ifTrueLabelType;
		}

		public LabelType getIfFalseLabelType() {
			return ifFalseLabelType;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder("br i1 ");
			sb.append(condition.getIdentifierOrValue());
			sb.append(", label ");
			sb.append(ifTrueLabelType.getIdentifier());
			sb.append(", label ");
			sb.append(ifFalseLabelType.getIdentifier());

			return sb.toString();
		}
	}

	public class UnconditionalBr extends BaseInstruction {
		private LabelType destination;

		@Override
		public String toString() {
			return "br label " + destination.getIdentifier();
		}
	}
}