/* Darence Thong
 * June 6th, 2021
 * Art Contest
 * Java 1 Highline College
 */

package prjSkyline;

import java.awt.*;

public class DrawBabyYoda {

	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(800, 600);
		Graphics g = panel.getGraphics ();

		// Custom colors
		Color steelDark = new Color(176, 179, 183);
		Color steelLight = new Color(202, 204, 206);
		Color silverD = new Color(208, 213, 219);
		Color lightBrown = new Color(195, 155, 119);
		Color tan = new Color(253, 217, 181);
		Color green1 = new Color(144, 238, 144);
		Color green2 = new Color(120, 200, 110);
		Color green3 = new Color(46, 139, 87);
		Color greenDark2 = new Color(51, 165, 50);
		Color greenDark3 = new Color(1,50, 32);
		Color pink = new Color(254, 184, 198);
		Color yellowDark = new Color (218, 165, 32);
		Color orangeDark = new Color (203, 92, 13);
		Color orangeDark2 = new Color (150, 64, 0);

		
		// NOTE: left and right in comments are in users view, not yoda's L/R
		
		/* index:
		 * 
		 * capsule 
		 * capsule cover lines
		 * capsule padding
		 * white out outside capsule
		 * side wedges
		 * capsule trim/buttons
		 * head
		 * ears
		 * nose
		 * mouth
		 * facial wrinkles/lines
		 * hands (includes clothes/right sleeve)
		 * clothes (left sleeve and collars)
		 * my initials
		 */

		g.setColor(steelDark); 				// capsule top cover border
		g.fillOval(197, 104, 405, 400);
		g.setColor(Color.black);
		g.drawOval(197, 104, 405, 400);
		
		g.setColor(steelLight); 			// capsule
		g.fillOval(200, 110, 400, 400);
		
		g.setColor(silverD);       // cover left vertical1 lines
		Polygon vertLeft = new Polygon ();
		vertLeft.addPoint(319, 129); //a
		vertLeft.addPoint(317, 150); //b
		vertLeft.addPoint(317, 166); //c
		vertLeft.addPoint(318, 179); //d
		vertLeft.addPoint(321, 191); //e
		vertLeft.addPoint(328, 191); //f
		vertLeft.addPoint(325, 179); //g
		vertLeft.addPoint(324, 166); //h
		vertLeft.addPoint(324, 150); //i
		vertLeft.addPoint(326, 125); //j
		g.fillPolygon(vertLeft);
		Polygon vertLeft2 = new Polygon (); // cover left vertical2 lines
		vertLeft2.addPoint(319+32, 118); //a
		vertLeft2.addPoint(318+30, 150); //b
		vertLeft2.addPoint(317+31, 166); //c
		vertLeft2.addPoint(318+32, 179); //d
		vertLeft2.addPoint(321+32, 191); //e
		vertLeft2.addPoint(328+32, 191); //f
		vertLeft2.addPoint(325+32, 179); //g
		vertLeft2.addPoint(324+31, 166); //h
		vertLeft2.addPoint(325+30, 150); //i
		vertLeft2.addPoint(326+32, 115); //j
		g.fillPolygon(vertLeft2);
		Polygon vertRight = new Polygon (); // cover right vertical1 lines
		vertRight.addPoint(448, 115); //a
		vertRight.addPoint(451, 150); //b
		vertRight.addPoint(451, 166); //c
		vertRight.addPoint(450, 179); //d
		vertRight.addPoint(448, 191); //e
		vertRight.addPoint(455, 191); //f
		vertRight.addPoint(457, 179); //g
		vertRight.addPoint(458, 166); //h
		vertRight.addPoint(458, 150); //i
		vertRight.addPoint(455, 118); //j
		g.fillPolygon(vertRight);
		Polygon vertRight2 = new Polygon (); // cover right vertical2 lines
		vertRight2.addPoint(448+32, 125); //a
		vertRight2.addPoint(451+32, 150); //b
		vertRight2.addPoint(451+32, 166); //c
		vertRight2.addPoint(449+33, 179); //d
		vertRight2.addPoint(446+34, 191); //e
		vertRight2.addPoint(453+34, 191); //f
		vertRight2.addPoint(456+33, 179); //g
		vertRight2.addPoint(458+32, 166); //h
		vertRight2.addPoint(458+32, 150); //i
		vertRight2.addPoint(455+33, 129); //j
		g.fillPolygon(vertRight2);
		g.setColor(steelDark);  //borders for capsule vertical lines
		g.drawPolygon(vertLeft2);
		g.drawPolygon(vertLeft);
		g.drawPolygon(vertRight);
		g.drawPolygon(vertRight2);
		
		
		g.setColor(orangeDark);				// capsule 	top	orange padding
		g.fillOval(202, 170, 397, 280);
		g.fillOval(153, 242, 486, 120);
		g.setColor(Color.black);
		g.drawOval(202, 170, 397, 280);     //black border top of orange padding
									// capsule 		trim
		g.setColor(steelLight); 		// fill trim
		g.fillOval(153, 273, 486, 120);

		g.setColor(orangeDark2);         // capsule  bottom	orange padding
		g.fillOval(153, 242, 486, 120);						
		g.setColor(steelLight);						// hide orange padding bottom
		Polygon capsuleHideOrg = new Polygon ();      
		capsuleHideOrg.addPoint(213, 365); //a
		capsuleHideOrg.addPoint(291, 452); //b
		capsuleHideOrg.addPoint(515, 454); //c
		capsuleHideOrg.addPoint(589, 365); //d
		g.fillPolygon(capsuleHideOrg);
				
		
		// capsule trim/"belt"
		
		g.setColor(Color.black); 				//bottom border trim
		g.drawOval(153, 273, 486, 120);
		g.setColor(Color.black);
		g.drawOval(153, 242, 486, 120); 		//top border trim
		
		g.setColor(Color.white); 				//whiteout outside of capsule
		Polygon whiteRight = new Polygon();
		whiteRight.addPoint(598, 266); //a       right side
		whiteRight.addPoint(657, 263); //b
		whiteRight.addPoint(654, 326); //c
		whiteRight.addPoint(632, 318); //d
		whiteRight.addPoint(626, 314); //e
		whiteRight.addPoint(620, 310); //f
		whiteRight.addPoint(610, 305); //g
		whiteRight.addPoint(600, 300); //h
		whiteRight.addPoint(599, 288); //i
		g.fillPolygon(whiteRight);
		Polygon whiteLeft = new Polygon ();
		whiteLeft.addPoint(174, 261); //a		left side
		whiteLeft.addPoint(204, 264); //b
		whiteLeft.addPoint(203, 283); //c
		whiteLeft.addPoint(200, 297); //d
		whiteLeft.addPoint(191, 301); //e
		whiteLeft.addPoint(184, 303); //f
		whiteLeft.addPoint(177, 306); //g
		whiteLeft.addPoint(158, 320); //h
		whiteLeft.addPoint(140, 295); //i
		g.fillPolygon(whiteLeft);
	
		
		// Wedges to complete top cover ending in middle
		
		g.setColor(steelLight);
		Polygon wedgeLeft = new Polygon ();    //left inner wedge
		wedgeLeft.addPoint(214, 263); //a
		wedgeLeft.addPoint(210, 275); //b
		wedgeLeft.addPoint(207, 284); //c
		wedgeLeft.addPoint(201, 300); //d
		wedgeLeft.addPoint(203, 284); //e
		wedgeLeft.addPoint(205, 263); //f
		g.fillPolygon(wedgeLeft);
		g.setColor(steelLight);
		Polygon wedgeRight = new Polygon ();    //right inner wedge
		wedgeRight.addPoint(590, 266); //a
		wedgeRight.addPoint(597, 268); //b
		wedgeRight.addPoint(599, 286); //c
		wedgeRight.addPoint(600, 302); //d
		wedgeRight.addPoint(596, 291); //e
		wedgeRight.addPoint(594, 281); //f
		g.fillPolygon(wedgeRight);
		
		g.setColor(steelDark);
		Polygon wedgeLeftOutside = new Polygon (); //left outside wedge
		wedgeLeftOutside.addPoint(201, 260); //a    
		wedgeLeftOutside.addPoint(206, 263); //b
		wedgeLeftOutside.addPoint(202, 283); //c
		Polygon wedgeRightOutside = new Polygon(); //right outside wedge
		wedgeRightOutside.addPoint(596, 267); //a    
		wedgeRightOutside.addPoint(600, 266); //b
		wedgeRightOutside.addPoint(599, 285); //c
		g.fillPolygon(wedgeLeftOutside);
		g.fillPolygon(wedgeRightOutside);
		
		g.setColor(Color.black);
		g.drawLine(202, 260, 201, 283); // left outer wedge border
		g.drawLine(214, 263, 210, 275); //a-b left inner wedge border
		g.drawLine(210, 275, 208, 284); //b-c
		g.drawLine(208, 284, 201, 299); //c-d
		g.drawLine(599, 266, 599, 285); // right outer wedge border
		g.drawLine(590, 267, 594, 281); //a-f right inner wedge border
		g.drawLine(594, 281, 596, 291); //f-e
		g.drawLine(596, 291, 600, 302); //e-d
		
		
		
		// capsule border
		
		g.setColor(Color.black);
		g.drawOval(200, 110, 400, 400);
		g.setColor(orangeDark2);		//remove border lines in mid
		g.fillRect(198, 300, 5, 37); 	// left
		g.fillRect(596, 303, 5, 32); 	// right
		g.setColor(steelLight);		//remove border lines on trim
		g.fillRect(200, 340, 6, 23); // left top
		g.fillRect(198, 352, 15, 15); // left middle
		g.fillRect(205, 360, 6, 11); // left bottom
		g.fillRect(596, 337, 4, 18);	// right top
		g.fillRect(590, 350, 15, 15); // right middle
		g.fillRect(589, 354, 6, 14);	// right bottom
		
		// capsule controls
		
		g.setColor(steelDark);
		g.fillRect(358,  364, 84, 23);
		g.setColor(Color.black);
		g.drawRect(358,  365, 84, 23);
		
		// buttons
		
		for (int i = 0; i < 3; i++) {
			g.setColor(silverD);
			g.fillRect(367 + 22 * i, 369, 22, 15);
			g.setColor(Color.black);
			g.drawRect(367 + 22 * i, 369, 22, 15);
		}
		
		
		
		// HEAD shape
		
		g.setColor(green1);
		g.fillOval(320, 175, 160, 120);								
		g.setColor(greenDark3);				// head border
		g.drawOval(320, 175, 160, 120);
		
		// EARS
		
		g.setColor(green1);					// left ear
		Polygon earLeft = new Polygon();
		earLeft.addPoint(335, 203); //top
		earLeft.addPoint(342, 275); //bottom
		earLeft.addPoint(283, 252); //dent
		earLeft.addPoint(203, 237); //tip of ear
		g.fillPolygon(earLeft);
		
		g.setColor(pink);					//inside left ear
		Polygon insideEarL = new Polygon();
		insideEarL.addPoint(327, 234);
		insideEarL.addPoint(312, 227);
		insideEarL.addPoint(228, 238); //tip
		insideEarL.addPoint(283, 249); //dent
		insideEarL.addPoint(333, 265); //bottom
		insideEarL.addPoint(327, 247);
		g.fillPolygon(insideEarL);
		g.setColor(greenDark2);
		g.drawPolygon(insideEarL);

									
		g.setColor(green1);					//right ear
		Polygon earRight = new Polygon();
		earRight.addPoint(470, 209);
		earRight.addPoint(458, 274);
		earRight.addPoint(516, 259); //bottom dent
		earRight.addPoint(610, 250); //tip of ear
		g.fillPolygon(earRight);

		g.setColor(pink);					//inside right ear
		Polygon insideEarR = new Polygon();
		insideEarR.addPoint(471, 236);
		insideEarR.addPoint(491, 232);
		insideEarR.addPoint(581, 250); //tip
		insideEarR.addPoint(516, 255); //bottom dent
		insideEarR.addPoint(468, 267);
		insideEarR.addPoint(473, 248);
		insideEarR.addPoint(472, 236);
		g.fillPolygon(insideEarR);
		g.setColor(greenDark2);
		g.drawPolygon(insideEarR);

		g.setColor(greenDark3);					// ears border
		g.drawLine(334, 204, 204, 237);
		g.drawLine(204, 237, 283, 252); // L tip to L dent
		g.drawLine(283, 252, 338, 274); // L dent to bottom L
		g.drawLine(473, 210, 608, 250); // top R to R tip
		g.drawLine(608, 250, 516, 259); //R tip to dent 
		g.drawLine(516, 259, 464, 274); //dent to bottom R
		
		
		
		// NOSE
		
		g.setColor(greenDark2);
		g.drawLine(394, 244, 391, 252); //a-b
		g.drawLine(391, 252, 395, 249); //b-c
		g.drawLine(395, 249, 400, 251); //c-d
		g.drawLine(400, 251, 404, 249); //d-e
		g.drawLine(404, 249, 408, 251); //e-f
		g.drawLine(408, 251, 406, 244); //f-g
		
		// nasolabial lines
		
		g.setColor(green2);
		g.drawLine(376, 263, 388, 254); // a-b left
		g.drawLine(413, 253, 424, 263); // a-b right
		g.drawLine(392, 260, 391, 267); // line 1 above mouth
		g.drawLine(400, 261, 400, 266); // line 2 above mouth
		g.drawLine(408, 262, 408, 269); // line 3 above mouth
	
		// MOUTH
		
		g.setColor(Color.black);
		g.drawLine(379, 269, 382, 271); // a-b
		g.drawLine(382, 271, 394, 269); // b-c
		g.drawLine(394, 269, 409, 270); // c-d
		g.drawLine(409, 270, 418, 272); // d-e
		g.drawLine(418, 272, 421, 270); // e-f
		
		// chin line
		
		g.setColor(green2);
		g.drawLine(386, 276, 393, 272); // a-b
		g.drawLine(393, 272, 407, 273); // b-c
		g.drawLine(407, 273, 415, 276); // c-d
		
		// CHEEK lines
		
		g.setColor(green2);
		g.drawLine(426, 268, 429, 274); // a-b right
		g.drawLine(429, 274, 436, 276); // b-c right
		g.drawLine(436, 276, 445, 276); // c-d right
		g.drawLine(445, 276, 455, 271); // d-e right
		g.drawLine(455, 271, 460, 267); // e-f right
		g.drawLine(344, 267, 350, 275); // a-b left
		g.drawLine(350, 275, 360, 275); // b-c left
		g.drawLine(360, 275, 363, 275); // c-d left
		g.drawLine(363, 275, 369, 274); // d-e left
		g.drawLine(369, 274, 373, 268); // e-f left

		// forehead wrinkles
		
		g.drawLine(359, 200, 376, 190); //a-b	top horizontal line
		g.drawLine(376, 190, 380, 189); //b-c
		g.drawLine(380, 189, 386, 187); //c-d
		g.drawLine(386, 187, 401, 189); //d-e
		g.drawLine(401, 189, 412, 186); //e-f
		g.drawLine(412, 186, 425, 187); //f-g
		g.drawLine(425, 187, 435, 192); //g-h
		g.drawLine(435, 192, 444, 197); //h-i

		g.drawLine(401, 193, 401, 222); //      central vertical line
		g.drawLine(369, 209, 373, 207); // A-B  main horizontal line
		g.drawLine(373, 207, 377, 205); // B-C
		g.drawLine(377, 205, 379, 203); // C-D
		g.drawLine(379, 203, 383, 201); // D-E
		g.drawLine(383, 201, 391, 201); // E-F
		g.drawLine(391, 201, 396, 202); // F-G
		g.drawLine(396, 202, 401, 205); // G-H center is H
		g.drawLine(401, 205, 406, 202); // H-I
		g.drawLine(406, 202, 411, 200); // I-J
		g.drawLine(411, 200, 420, 201); // J-K
		g.drawLine(420, 201, 424, 203); // K-L
		g.drawLine(424, 203, 427, 206); // L-M
		g.drawLine(427, 206, 431, 206); // M-N
		g.drawLine(431, 206, 437, 207); // N-O
	
		g.drawLine(346, 228, 352, 222); // A-B  LEFT "eyebrow"
		g.drawLine(352, 222, 359, 217); // B-C
		g.drawLine(359, 217, 372, 212); // C-D
		g.drawLine(372, 212, 378, 214); // D-E
		g.drawLine(378, 214, 383, 215); // E-F
		g.drawLine(383, 215, 385, 216); // F-G
		g.drawLine(385, 216, 390, 225); // G-H
		g.drawLine(390, 225, 392, 234); // H-I
		g.drawLine(408, 235, 410, 229); // A-B  RIGHT "eybrow"
		g.drawLine(410, 229, 412, 222); // B-C
		g.drawLine(412, 222, 420, 214); // C-D
		g.drawLine(420, 214, 431, 212); // D-E
		g.drawLine(431, 212, 443, 215); // E-F
		g.drawLine(443, 215, 450, 220); // F-G
		g.drawLine(450, 220, 454, 225); // G-H
		g.drawLine(454, 225, 457, 228); // H-I
		
		// EYES
		
		// eyeball
		
		g.setColor(Color.white);
		g.fillOval(350, 222, 38, 31); // left
		g.fillOval(413, 222, 38, 31); // right
		g.setColor(greenDark2);
		g.drawOval(350, 222, 38, 31); // left outline
		g.drawOval(413, 222, 38, 31); // right outline
		g.setColor(Color.black);
		g.fillOval(354, 223, 30, 30); // left pupil
		g.fillOval(418, 223, 29, 29); // right pupil
		
		// pupil reflection
		
		g.setColor(Color.white);
		g.fillOval(373,  230, 5, 7);  // left
		g.fillOval(435, 230, 7, 7); // right
		
		// eyelids-shape
		
		g.setColor(greenDark2);
		g.drawLine(355, 228, 348, 239); // left top a-b
		g.drawLine(348, 239, 343, 242); // left top b-c
		g.drawLine(354, 247, 348, 240); // left bottom a-b
		g.drawLine(443, 225, 451, 234); // right top a-b
		g.drawLine(451, 234, 457, 240); // right top b-c
		g.drawLine(442, 251, 453, 239); // right bottom a-b
	
		
		//background CLOTHES and right sleeve B4 both hand
		
		g.setColor(lightBrown);				
		Polygon blanket = new Polygon();
		blanket.addPoint(350, 293); //a
		blanket.addPoint(451, 289); //b
		blanket.addPoint(525, 299); //c
		blanket.addPoint(537, 313); //d
		blanket.addPoint(536, 329); //e
		blanket.addPoint(522, 350); //f
		blanket.addPoint(507, 349); //g
		blanket.addPoint(498, 345); //h
		blanket.addPoint(499, 356); //i
		blanket.addPoint(452, 360); //j
		blanket.addPoint(395, 361); //k
		blanket.addPoint(294, 356); //l
		g.fillPolygon(blanket);
		g.setColor(Color.black);
		g.drawPolygon(blanket);
		g.drawLine(482, 326, 498, 345); // for sleeve a-b (b = g blanket)
		g.drawLine(528, 328, 519, 338); //a-b right sleeve curve
		g.drawLine(519, 338, 508, 339); //b-c
		g.drawLine(508, 339, 497, 333); //c-d
		g.drawLine(497, 333, 499, 325); //d-e
		g.drawLine(472, 346, 450, 353); //a-b diagonal fold near trim
		g.drawLine(450, 353, 422, 358); //b-c
		g.drawLine(409, 316, 406, 337); //a-b center vertical
		g.drawLine(406, 337, 407, 363); //b-c
		
		
		
		// LEFT HAND
		
		g.setColor(yellowDark);
		Polygon lIndex = new Polygon(); // left index finger
		lIndex.addPoint(367, 361); //a located behind left hand
		lIndex.addPoint(366, 355); //b next to i of left hand
		lIndex.addPoint(372, 360); //c
		lIndex.addPoint(371, 367); //d
		lIndex.addPoint(363, 365); //e behind left hand
		g.fillPolygon(lIndex);
		g.setColor(greenDark3); //border of left index finger
		g.drawPolygon(lIndex);
		g.setColor(green1);      //left hand
		Polygon lHand = new Polygon();
		lHand.addPoint(325, 355); //a
		lHand.addPoint(345, 366); //b
		lHand.addPoint(354, 374); //c
		lHand.addPoint(360, 380); //d
		lHand.addPoint(360, 375); //e
		lHand.addPoint(357, 363); //f
		lHand.addPoint(365, 375); //g
		lHand.addPoint(366, 363); //h
		lHand.addPoint(365, 351); //i
		lHand.addPoint(356, 346); //j
		lHand.addPoint(345, 345); //k
		lHand.addPoint(333, 348); //l
		g.fillPolygon(lHand);  
		g.setColor(yellowDark); // middle finger nail
		Polygon mNail = new Polygon();
		mNail.addPoint(361, 369); //a
		mNail.addPoint(366, 364); //b 
		mNail.addPoint(365, 375); //c same as left hand g
		g.fillPolygon(mNail);
		Polygon pNail = new Polygon(); // pinky nail
		pNail.addPoint(354, 375); //a
		pNail.addPoint(359, 371); //b 
		pNail.addPoint(360, 380); //c same as left hand d
		g.fillPolygon(pNail);
		g.setColor(greenDark3); // left hand borders
		g.drawPolygon(pNail);
		g.drawPolygon(mNail);
		g.drawPolygon(lHand);
		g.drawLine(350, 356, 357, 363); // line for pink and middle finger a-b (b= f in hand)
	
		
		// Right hand
		
		g.setColor(green1);      // right hand
		Polygon rHand = new Polygon();
		rHand.addPoint(506, 325); //a
		rHand.addPoint(502, 314); //b
		rHand.addPoint(494, 312); //c
		rHand.addPoint(490, 307); //d
		rHand.addPoint(493, 303); //e
		rHand.addPoint(503, 302); //f
		rHand.addPoint(508, 303); //g
		rHand.addPoint(508, 300); //h
		rHand.addPoint(510, 291); //i
		rHand.addPoint(512+3, 281); //j
		rHand.addPoint(516+3, 276); //k
		rHand.addPoint(520+5, 281); //l
		rHand.addPoint(521, 300); //m
		rHand.addPoint(524, 301); //n
		rHand.addPoint(538, 293+5); //o
		rHand.addPoint(543, 296+5); //p
		rHand.addPoint(541, 306); //q
		rHand.addPoint(532, 310); //r
		rHand.addPoint(530, 311); //s
		rHand.addPoint(525, 326); //t
		rHand.addPoint(515, 325); //u
		g.fillPolygon(rHand);
		g.setColor(greenDark3); // right hand border
		g.drawPolygon(rHand);
		
		g.setColor(green3);
		g.drawLine(515, 325, 518, 323);     // greenDark3 palm wrinkle a-b (a = u in R hand)
		g.drawLine(507, 306, 515, 313);   	// r palm line  a-b
		g.drawLine(515, 316, 523, 309);   	// r palm line  b-c

		g.drawLine(502, 314, 505, 313);	// bottom of R thumb a-b (a = b in R hand)
		g.drawLine(513, 302, 520, 301);	// bottom of R middle 
		g.drawLine(528, 307, 532, 310);	// R pinky a-b (b = r in R hand)
		
		g.setColor(yellowDark);  			// right hand nails
		Polygon nailRThumb = new Polygon();
		nailRThumb.addPoint(484, 308); //a			// right thumb nail
		nailRThumb.addPoint(491, 304); //b
		nailRThumb.addPoint(492, 311); //c
		g.fillPolygon(nailRThumb);
		Polygon nailRMiddle = new Polygon(); // right middle nail
		nailRMiddle.addPoint(518, 279); //a
		nailRMiddle.addPoint(522, 271); //b
		nailRMiddle.addPoint(524, 280); //c
		g.fillPolygon(nailRMiddle);
		Polygon nailRPinky = new Polygon();  // right pinky nail
		nailRPinky.addPoint(541, 300); //a
		nailRPinky.addPoint(547, 303); //b
		nailRPinky.addPoint(542, 306); //c
		g.fillPolygon(nailRPinky);
		g.setColor(Color.black);   //borders for nails
		g.drawPolygon(nailRThumb);
		g.drawPolygon(nailRMiddle);
		g.drawPolygon(nailRPinky);
		
	
		
		// CLOTHES: mainly collors and sleeves, see before hands for other part of clothes
		
		
		g.setColor(lightBrown);				// left sleeve
		Polygon sleeveLeft = new Polygon();
		sleeveLeft.addPoint(333, 295); //a
		sleeveLeft.addPoint(304, 301); //b
		sleeveLeft.addPoint(302, 317); //c
		sleeveLeft.addPoint(290, 332); //d
		sleeveLeft.addPoint(292, 346); //e
		sleeveLeft.addPoint(324, 362); //f
		sleeveLeft.addPoint(353, 343); //g
		sleeveLeft.addPoint(370, 340); //h
		sleeveLeft.addPoint(371, 308); //i
		g.fillPolygon(sleeveLeft);
		g.setColor(Color.black); 	// L sleeve border
		g.drawPolygon(sleeveLeft);
		g.drawLine(315, 315, 358, 333); //sleeve top line
		g.drawLine(310, 335, 325, 330); // a-b sleeve lower line
		g.drawLine(325, 330, 342, 330); // b-c
		
		
		g.setColor(tan);					 					// right collar
		Polygon collarRight = new Polygon();
		collarRight.addPoint(405, 288); //a  (behind left collar)
		collarRight.addPoint(435, 289); //b
		collarRight.addPoint(452, 278); //c
		collarRight.addPoint(476, 275); //d
		collarRight.addPoint(486, 280); //e
		collarRight.addPoint(484, 296); //f
		collarRight.addPoint(450, 311); //g
		collarRight.addPoint(376, 328); //h
		g.fillPolygon(collarRight);
		g.setColor(Color.black); // right collar border
		g.drawPolygon(collarRight);

		g.setColor(tan);
		Polygon collarLeft = new Polygon(); 					// left collar 
		collarLeft.addPoint(318, 292); //a
		collarLeft.addPoint(339, 272); //b
		collarLeft.addPoint(356, 275); //c
		collarLeft.addPoint(373, 278); //d
		collarLeft.addPoint(390, 285); //e
		collarLeft.addPoint(429, 284); //f
		collarLeft.addPoint(402, 300); //g
		collarLeft.addPoint(395, 320); //h
		collarLeft.addPoint(364, 307); //i
		g.fillPolygon(collarLeft);
		g.setColor(Color.black); // L collar border
		g.drawPolygon(collarLeft);
		
		g.drawString("DCT 2021", 450, 379);  // marking my initials
				
	}
	
}
