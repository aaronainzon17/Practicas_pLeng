/* Generated By:JavaCC: Do not edit this line. CompiladorClasesTokenManager.java */

/** Token Manager. */
public class CompiladorClasesTokenManager implements CompiladorClasesConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x800000L) != 0L)
            return 10;
         if ((active0 & 0x30f80fc0fff80L) != 0L)
         {
            jjmatchedKind = 50;
            return 11;
         }
         return -1;
      case 1:
         if ((active0 & 0x4000a800L) != 0L)
            return 11;
         if ((active0 & 0x30f80bc0f5780L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 50;
               jjmatchedPos = 1;
            }
            return 11;
         }
         return -1;
      case 2:
         if ((active0 & 0x480a4075500L) != 0L)
            return 11;
         if ((active0 & 0x30b0018080280L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 50;
               jjmatchedPos = 2;
            }
            return 11;
         }
         if ((active0 & 0x2000L) != 0L)
            return 2;
         return -1;
      case 3:
         if ((active0 & 0x1020000000000L) != 0L)
            return 11;
         if ((active0 & 0x20d001c082280L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 3;
            return 11;
         }
         return -1;
      case 4:
         if ((active0 & 0x2000000002000L) != 0L)
            return 11;
         if ((active0 & 0xd001c080280L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 4;
            return 11;
         }
         return -1;
      case 5:
         if ((active0 & 0x4080000L) != 0L)
            return 11;
         if ((active0 & 0xd0018000280L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 5;
            return 11;
         }
         return -1;
      case 6:
         if ((active0 & 0xc0000000000L) != 0L)
            return 11;
         if ((active0 & 0x10018000280L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 6;
            return 11;
         }
         return -1;
      case 7:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 50;
            jjmatchedPos = 7;
            return 11;
         }
         if ((active0 & 0x10018000080L) != 0L)
            return 11;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 37:
         jjmatchedKind = 5;
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 40:
         return jjStopAtPos(0, 51);
      case 41:
         return jjStopAtPos(0, 52);
      case 42:
         return jjStopAtPos(0, 25);
      case 43:
         return jjStopAtPos(0, 22);
      case 44:
         return jjStopAtPos(0, 21);
      case 45:
         return jjStartNfaWithStates_0(0, 23, 10);
      case 47:
         return jjStopAtPos(0, 24);
      case 58:
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 59:
         return jjStopAtPos(0, 20);
      case 60:
         jjmatchedKind = 33;
         return jjMoveStringLiteralDfa1_0(0x3000000000L);
      case 61:
         return jjStopAtPos(0, 34);
      case 62:
         jjmatchedKind = 32;
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x20080000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x80010000000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x50004001000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x2000000014400L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa1_0(0x8000008000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x280L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x2800L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x1000000000000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa1_0(0x20100L);
      default :
         return jjMoveNfa_0(4, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 37:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      case 61:
         if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(1, 35);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(1, 36);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(1, 38);
         break;
      case 62:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x2080010020100L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000040000L);
      case 73:
      case 105:
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 11;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x2400L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x40024001000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x8088000000L);
      case 81:
      case 113:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(1, 15, 11);
         break;
      case 82:
      case 114:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(1, 30, 11);
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000280L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000004000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 95:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000080000L);
      case 68:
      case 100:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(2, 29, 11);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 39, 11);
         break;
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000000L);
      case 70:
      case 102:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(2, 18, 11);
         break;
      case 73:
      case 105:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(2, 14, 11);
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 76:
      case 108:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(2, 17, 11);
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000000L);
      case 78:
      case 110:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(2, 10, 11);
         break;
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000080L);
      case 81:
      case 113:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(2, 16, 11);
         break;
      case 82:
      case 114:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(2, 8, 11);
         return jjMoveStringLiteralDfa3_0(active0, 0x80010000000L);
      case 84:
      case 116:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(2, 31, 11);
         return jjMoveStringLiteralDfa3_0(active0, 0x40004000000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0xc0010000000L);
      case 69:
      case 101:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 48, 11);
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x2200L);
      case 82:
      case 114:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 41, 11);
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 67:
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x40010000200L);
      case 69:
      case 101:
         if ((active0 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 49, 11);
         return jjMoveStringLiteralDfa5_0(active0, 0x80008000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000000L);
      case 79:
      case 111:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(4, 13, 11);
         return jjMoveStringLiteralDfa5_0(active0, 0x80000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000080L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x40008000080L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x200L);
      case 78:
      case 110:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(5, 19, 11);
         return jjMoveStringLiteralDfa6_0(active0, 0x80000000000L);
      case 79:
      case 111:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(5, 26, 11);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x10000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x10000000000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa7_0(active0, 0x80L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa7_0(active0, 0x200L);
      case 82:
      case 114:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 42, 11);
         break;
      case 84:
      case 116:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 43, 11);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(7, 7, 11);
         break;
      case 73:
      case 105:
         return jjMoveStringLiteralDfa8_0(active0, 0x200L);
      case 79:
      case 111:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(7, 27, 11);
         break;
      case 82:
      case 114:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(7, 28, 11);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 40, 11);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 79:
      case 111:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(8, 9, 11);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 10;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 11:
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  jjCheckNAddStates(0, 2);
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 46)
                        kind = 46;
                     jjCheckNAddStates(3, 5);
                  }
                  else if (curChar == 45)
                     jjCheckNAddTwoStates(5, 6);
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  jjCheckNAddStates(0, 2);
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(6, 7);
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 46)
                        kind = 46;
                     jjCheckNAdd(5);
                  }
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 46)
                     kind = 46;
                  jjCheckNAdd(5);
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(6, 7);
                  break;
               case 7:
                  if (curChar == 46)
                     jjCheckNAdd(8);
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 47)
                     kind = 47;
                  jjCheckNAdd(8);
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 46)
                     kind = 46;
                  jjCheckNAddStates(3, 5);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 11:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 50)
                        kind = 50;
                     jjCheckNAddStates(0, 2);
                  }
                  else if (curChar == 95)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 4:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 50)
                        kind = 50;
                     jjCheckNAddStates(0, 2);
                  }
                  else if (curChar == 95)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 2:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 50)
                        kind = 50;
                     jjCheckNAddStates(0, 2);
                  }
                  else if (curChar == 95)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 0:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  jjCheckNAddStates(0, 2);
                  break;
               case 1:
                  if (curChar == 95)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 10 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   0, 1, 3, 5, 6, 7, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\45", "\45\45", null, null, null, null, null, 
null, null, null, null, null, null, null, null, "\73", "\54", "\53", "\55", "\57", 
"\52", null, null, null, null, null, null, "\76", "\74", "\75", "\76\75", "\74\75", 
"\74\76", "\72\75", null, null, null, null, null, null, null, null, null, null, null, 
null, "\50", "\51", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1fcfffffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[10];
static private final int[] jjstateSet = new int[20];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public CompiladorClasesTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public CompiladorClasesTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 10; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 5 :
        image.append(jjstrLiteralImages[5]);
        lengthOfMatch = jjstrLiteralImages[5].length();
          System.out.println("COMCORTO");
         break;
      case 6 :
        image.append(jjstrLiteralImages[6]);
        lengthOfMatch = jjstrLiteralImages[6].length();
          System.out.println("COMLARGO");
         break;
      case 7 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("programa");
         break;
      case 8 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("var");
         break;
      case 9 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("principio");
         break;
      case 10 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("fin");
         break;
      case 11 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("si");
         break;
      case 12 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("ent");
         break;
      case 13 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("si_no");
         break;
      case 14 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("fsi");
         break;
      case 15 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("mq");
         break;
      case 16 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("fmq");
         break;
      case 17 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("val");
         break;
      case 18 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("ref");
         break;
      case 19 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("accion");
         break;
      case 20 :
        image.append(jjstrLiteralImages[20]);
        lengthOfMatch = jjstrLiteralImages[20].length();
        System.out.println("FIN_SENTENCIA");
         break;
      case 21 :
        image.append(jjstrLiteralImages[21]);
        lengthOfMatch = jjstrLiteralImages[21].length();
        System.out.println("SEPARADOR");
         break;
      case 22 :
        image.append(jjstrLiteralImages[22]);
        lengthOfMatch = jjstrLiteralImages[22].length();
        System.out.println("SUMA");
         break;
      case 23 :
        image.append(jjstrLiteralImages[23]);
        lengthOfMatch = jjstrLiteralImages[23].length();
        System.out.println("RESTA");
         break;
      case 24 :
        image.append(jjstrLiteralImages[24]);
        lengthOfMatch = jjstrLiteralImages[24].length();
        System.out.println("DIVISION");
         break;
      case 25 :
        image.append(jjstrLiteralImages[25]);
        lengthOfMatch = jjstrLiteralImages[25].length();
        System.out.println("MULT");
         break;
      case 26 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("entero");
         break;
      case 27 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("booleano");
         break;
      case 28 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("caracter");
         break;
      case 29 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("and");
         break;
      case 30 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("or");
         break;
      case 31 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("not");
         break;
      case 32 :
        image.append(jjstrLiteralImages[32]);
        lengthOfMatch = jjstrLiteralImages[32].length();
          System.out.println(" >");
         break;
      case 33 :
        image.append(jjstrLiteralImages[33]);
        lengthOfMatch = jjstrLiteralImages[33].length();
          System.out.println("<");
         break;
      case 34 :
        image.append(jjstrLiteralImages[34]);
        lengthOfMatch = jjstrLiteralImages[34].length();
          System.out.println("=");
         break;
      case 35 :
        image.append(jjstrLiteralImages[35]);
        lengthOfMatch = jjstrLiteralImages[35].length();
          System.out.println(">=");
         break;
      case 36 :
        image.append(jjstrLiteralImages[36]);
        lengthOfMatch = jjstrLiteralImages[36].length();
          System.out.println("<=");
         break;
      case 37 :
        image.append(jjstrLiteralImages[37]);
        lengthOfMatch = jjstrLiteralImages[37].length();
          System.out.println("<>");
         break;
      case 38 :
        image.append(jjstrLiteralImages[38]);
        lengthOfMatch = jjstrLiteralImages[38].length();
          System.out.println(":=");
         break;
      case 39 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("mod");
         break;
      case 40 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("escribir");
         break;
      case 41 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("leer");
         break;
      case 42 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("entacar");
         break;
      case 43 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("caraent");
         break;
      case 46 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
        System.out.println("VALOR_ENTERO (Valor: " + matchedToken + ")");
         break;
      case 47 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                System.out.println("VALOR_DECIMAL (Valor: " + matchedToken + ")");
         break;
      case 48 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("true");
         break;
      case 49 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
          System.out.println("false");
         break;
      case 50 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
        System.out.println("IDENTIFICADOR (Valor: " + matchedToken + ")");
         break;
      case 51 :
        image.append(jjstrLiteralImages[51]);
        lengthOfMatch = jjstrLiteralImages[51].length();
    System.out.println("PAR_IZQ");
         break;
      case 52 :
        image.append(jjstrLiteralImages[52]);
        lengthOfMatch = jjstrLiteralImages[52].length();
    System.out.println("PAR_DCHA");
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}