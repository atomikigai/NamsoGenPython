package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import w.c;
import w.d;
import w.f;
import w.g;
import w.h;
import x.b;
import z.e;
import z.q;
import z.s;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class Flow extends s {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g f547u;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // z.s, z.b
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        g gVar = new g();
        gVar.f9429s0 = 0;
        gVar.f9430t0 = 0;
        gVar.f9431u0 = 0;
        gVar.f9432v0 = 0;
        gVar.f9433w0 = 0;
        gVar.f9434x0 = 0;
        gVar.f9435y0 = false;
        gVar.f9436z0 = 0;
        gVar.A0 = 0;
        gVar.B0 = new b();
        gVar.C0 = null;
        gVar.D0 = -1;
        gVar.E0 = -1;
        gVar.F0 = -1;
        gVar.G0 = -1;
        gVar.H0 = -1;
        gVar.I0 = -1;
        gVar.J0 = 0.5f;
        gVar.K0 = 0.5f;
        gVar.L0 = 0.5f;
        gVar.M0 = 0.5f;
        gVar.N0 = 0.5f;
        gVar.O0 = 0.5f;
        gVar.P0 = 0;
        gVar.Q0 = 0;
        gVar.R0 = 2;
        gVar.S0 = 2;
        gVar.T0 = 0;
        gVar.U0 = -1;
        gVar.V0 = 0;
        gVar.W0 = new ArrayList();
        gVar.X0 = null;
        gVar.Y0 = null;
        gVar.Z0 = null;
        gVar.f9428b1 = 0;
        this.f547u = gVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f10854b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f547u.V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.f547u;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f9429s0 = dimensionPixelSize;
                    gVar2.f9430t0 = dimensionPixelSize;
                    gVar2.f9431u0 = dimensionPixelSize;
                    gVar2.f9432v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar3 = this.f547u;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.f9431u0 = dimensionPixelSize2;
                    gVar3.f9433w0 = dimensionPixelSize2;
                    gVar3.f9434x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f547u.f9432v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f547u.f9433w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f547u.f9429s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f547u.f9434x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f547u.f9430t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f547u.T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f547u.D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f547u.E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f547u.F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f547u.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f547u.G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f547u.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f547u.J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f547u.L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f547u.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f547u.M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f547u.O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f547u.K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f547u.R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f547u.S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f547u.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f547u.Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f547u.U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f10721d = this.f547u;
        i();
    }

    @Override // z.b
    public final void h(d dVar, boolean z4) {
        g gVar = this.f547u;
        int i = gVar.f9431u0;
        if (i > 0 || gVar.f9432v0 > 0) {
            if (z4) {
                gVar.f9433w0 = gVar.f9432v0;
                gVar.f9434x0 = i;
            } else {
                gVar.f9433w0 = i;
                gVar.f9434x0 = gVar.f9432v0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:110:0x0206  */
    /* JADX WARN: Code duplicated, block: B:112:0x020e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0216  */
    /* JADX WARN: Code duplicated, block: B:117:0x0227  */
    /* JADX WARN: Code duplicated, block: B:119:0x022e  */
    /* JADX WARN: Code duplicated, block: B:121:0x023b  */
    /* JADX WARN: Code duplicated, block: B:137:0x025e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0273 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x0275  */
    /* JADX WARN: Code duplicated, block: B:149:0x029e  */
    /* JADX WARN: Code duplicated, block: B:154:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:156:0x02af  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:161:0x02da  */
    /* JADX WARN: Code duplicated, block: B:163:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:165:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:166:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:169:0x0319  */
    /* JADX WARN: Code duplicated, block: B:171:0x0322  */
    /* JADX WARN: Code duplicated, block: B:173:0x0326  */
    /* JADX WARN: Code duplicated, block: B:174:0x0337  */
    /* JADX WARN: Code duplicated, block: B:177:0x0359  */
    /* JADX WARN: Code duplicated, block: B:182:0x0370  */
    /* JADX WARN: Code duplicated, block: B:184:0x0384  */
    /* JADX WARN: Code duplicated, block: B:186:0x0388  */
    /* JADX WARN: Code duplicated, block: B:188:0x038d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:189:0x038f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0397  */
    /* JADX WARN: Code duplicated, block: B:196:0x039f  */
    /* JADX WARN: Code duplicated, block: B:199:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:200:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:202:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:204:0x03b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:205:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:209:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:212:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:218:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:227:0x03e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:228:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:229:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:234:0x0400  */
    /* JADX WARN: Code duplicated, block: B:243:0x0417  */
    /* JADX WARN: Code duplicated, block: B:246:0x041e  */
    /* JADX WARN: Code duplicated, block: B:248:0x0421  */
    /* JADX WARN: Code duplicated, block: B:250:0x0427  */
    /* JADX WARN: Code duplicated, block: B:261:0x0443  */
    /* JADX WARN: Code duplicated, block: B:266:0x0457  */
    /* JADX WARN: Code duplicated, block: B:271:0x0465  */
    /* JADX WARN: Code duplicated, block: B:273:0x046b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:274:0x046d  */
    /* JADX WARN: Code duplicated, block: B:279:0x047d  */
    /* JADX WARN: Code duplicated, block: B:281:0x0483 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:282:0x0485  */
    /* JADX WARN: Code duplicated, block: B:295:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:298:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:300:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:302:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:304:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:321:0x051e  */
    /* JADX WARN: Code duplicated, block: B:323:0x0533 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:324:0x0535  */
    /* JADX WARN: Code duplicated, block: B:326:0x0543  */
    /* JADX WARN: Code duplicated, block: B:328:0x0548  */
    /* JADX WARN: Code duplicated, block: B:330:0x0556  */
    /* JADX WARN: Code duplicated, block: B:347:0x0579  */
    /* JADX WARN: Code duplicated, block: B:349:0x0590  */
    /* JADX WARN: Code duplicated, block: B:351:0x0594  */
    /* JADX WARN: Code duplicated, block: B:359:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:364:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:366:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:367:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:371:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:373:0x0600  */
    /* JADX WARN: Code duplicated, block: B:375:0x0604  */
    /* JADX WARN: Code duplicated, block: B:376:0x0615  */
    /* JADX WARN: Code duplicated, block: B:379:0x0637  */
    /* JADX WARN: Code duplicated, block: B:381:0x0640  */
    /* JADX WARN: Code duplicated, block: B:383:0x0644  */
    /* JADX WARN: Code duplicated, block: B:384:0x0655  */
    /* JADX WARN: Code duplicated, block: B:387:0x0677  */
    /* JADX WARN: Code duplicated, block: B:391:0x068d  */
    /* JADX WARN: Code duplicated, block: B:394:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:396:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:397:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:400:0x06fe A[LOOP:18: B:399:0x06fc->B:400:0x06fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:405:0x0728 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:406:0x072a  */
    /* JADX WARN: Code duplicated, block: B:407:0x072f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:408:0x0731  */
    /* JADX WARN: Code duplicated, block: B:409:0x0733  */
    /* JADX WARN: Code duplicated, block: B:411:0x0736  */
    /* JADX WARN: Code duplicated, block: B:412:0x0739 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:413:0x073b  */
    /* JADX WARN: Code duplicated, block: B:414:0x0742 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:415:0x0744  */
    /* JADX WARN: Code duplicated, block: B:416:0x0746  */
    /* JADX WARN: Code duplicated, block: B:419:0x0755  */
    /* JADX WARN: Code duplicated, block: B:420:0x0757  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:430:0x010f A[EDGE_INSN: B:430:0x010f->B:63:0x010f BREAK  A[LOOP:1: B:57:0x00f8->B:62:0x010a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x03a5 A[EDGE_INSN: B:448:0x03a5->B:198:0x03a5 BREAK  A[LOOP:7: B:187:0x038b->B:197:0x03a2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:451:0x03a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x04a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x049a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00da  */
    /* JADX WARN: Code duplicated, block: B:474:0x0476 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:477:0x048e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x03ca A[EDGE_INSN: B:478:0x03ca->B:214:0x03ca BREAK  A[LOOP:13: B:203:0x03b0->B:213:0x03c7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:481:0x03c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:59:0x0100  */
    /* JADX WARN: Code duplicated, block: B:61:0x0108  */
    /* JADX WARN: Code duplicated, block: B:64:0x0111  */
    /* JADX WARN: Code duplicated, block: B:67:0x011a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0128  */
    /* JADX WARN: Code duplicated, block: B:72:0x0135  */
    /* JADX WARN: Code duplicated, block: B:75:0x0140  */
    /* JADX WARN: Code duplicated, block: B:77:0x0143  */
    /* JADX WARN: Code duplicated, block: B:79:0x0146  */
    /* JADX WARN: Code duplicated, block: B:81:0x0149  */
    /* JADX WARN: Code duplicated, block: B:84:0x015a  */
    /* JADX WARN: Code duplicated, block: B:86:0x015f  */
    /* JADX WARN: Code duplicated, block: B:87:0x016f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // z.s
    public final void j(g gVar, int i, int i10) {
        c cVar;
        c cVar2;
        c cVar3;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        int i17;
        int i18;
        d[] dVarArr;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        d[] dVarArr2;
        int i24;
        d[] dVarArr3;
        int i25;
        int i26;
        int[] iArr2;
        int i27;
        int i28;
        f fVar;
        int i29;
        char c10;
        char c11;
        int i30;
        int i31;
        int iMin;
        boolean z4;
        int i32;
        d[] dVarArr4;
        int i33;
        f fVar2;
        int i34;
        int i35;
        int i36;
        d dVar;
        int iT;
        boolean z10;
        int i37;
        int size;
        boolean z11;
        int i38;
        int i39;
        int i40;
        int i41;
        c cVar4;
        c cVar5;
        c cVar6;
        c cVar7;
        int i42;
        int iMax;
        int i43;
        f fVar3;
        int iD;
        int iC;
        int i44;
        f fVar4;
        int i45;
        int i46;
        d dVar2;
        int iU;
        boolean z12;
        int i47;
        d[] dVarArr5;
        int i48;
        int i49;
        int iCeil;
        int iCeil2;
        int i50;
        int i51;
        int i52;
        d dVar3;
        int iT2;
        boolean z13;
        d[] dVarArr6;
        Object obj;
        d[] dVarArr7;
        int i53;
        int i54;
        int iU2;
        int i55;
        int iT3;
        d dVar4;
        d dVar5;
        int i56;
        int i57;
        d dVar6;
        d dVar7;
        d dVar8;
        int i58;
        int i59;
        int i60;
        d dVar9;
        int iU3;
        int i61;
        int i62;
        d[] dVarArr8;
        f fVar5;
        char c12;
        int i63;
        int i64;
        int i65;
        int i66;
        d dVar10;
        int iT4;
        boolean z14;
        int i67;
        int size2;
        boolean z15;
        int i68;
        int i69;
        int i70;
        int i71;
        c cVar8;
        c cVar9;
        c cVar10;
        c cVar11;
        int i72;
        int iMax2;
        int i73;
        f fVar6;
        int iD2;
        int iC2;
        int i74;
        f fVar7;
        int i75;
        int i76;
        int i77;
        int i78;
        d dVar11;
        int iU4;
        int i79;
        int i80;
        boolean z16;
        int i81;
        int i82;
        int i83;
        int i84;
        d dVar12;
        d[] dVarArr9;
        int i85;
        c cVar12;
        c cVar13;
        c cVar14;
        ArrayList arrayList2;
        int i86;
        int mode = View.MeasureSpec.getMode(i);
        int size3 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size4 = View.MeasureSpec.getSize(i10);
        if (gVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        int[] iArr3 = gVar.f9392p0;
        c cVar15 = gVar.J;
        c cVar16 = gVar.I;
        c cVar17 = gVar.K;
        c cVar18 = gVar.L;
        ArrayList arrayList3 = gVar.W0;
        if (gVar.f9444r0 > 0) {
            b bVar = gVar.B0;
            d dVar13 = gVar.T;
            e eVar = dVar13 != null ? ((w.e) dVar13).f9407u0 : null;
            if (eVar == null) {
                gVar.f9436z0 = 0;
                gVar.A0 = 0;
                gVar.f9435y0 = false;
            } else {
                int i87 = 0;
                while (i87 < gVar.f9444r0) {
                    d dVar14 = gVar.f9443q0[i87];
                    if (dVar14 == null) {
                        cVar12 = cVar16;
                    } else {
                        cVar12 = cVar16;
                        if (!(dVar14 instanceof h)) {
                            cVar13 = cVar17;
                            int iJ = dVar14.j(0);
                            cVar14 = cVar18;
                            int iJ2 = dVar14.j(1);
                            arrayList2 = arrayList3;
                            if (iJ == 3) {
                                i86 = i87;
                                if (dVar14.f9394r == 1 || iJ2 != 3 || dVar14.f9395s == 1) {
                                }
                            } else {
                                i86 = i87;
                            }
                            if (iJ == 3) {
                                iJ = 2;
                            }
                            if (iJ2 == 3) {
                                iJ2 = 2;
                            }
                            bVar.f9967a = iJ;
                            bVar.f9968b = iJ2;
                            bVar.f9969c = dVar14.q();
                            bVar.f9970d = dVar14.k();
                            eVar.b(dVar14, bVar);
                            dVar14.O(bVar.e);
                            dVar14.L(bVar.f9971f);
                            dVar14.I(bVar.f9972g);
                        }
                        i87 = i86 + 1;
                        cVar16 = cVar12;
                        cVar17 = cVar13;
                        cVar18 = cVar14;
                        arrayList3 = arrayList2;
                    }
                    cVar13 = cVar17;
                    cVar14 = cVar18;
                    arrayList2 = arrayList3;
                    i86 = i87;
                    i87 = i86 + 1;
                    cVar16 = cVar12;
                    cVar17 = cVar13;
                    cVar18 = cVar14;
                    arrayList3 = arrayList2;
                }
                cVar = cVar16;
                cVar2 = cVar17;
                cVar3 = cVar18;
                arrayList = arrayList3;
                i11 = gVar.f9433w0;
                i12 = gVar.f9434x0;
                i13 = gVar.f9429s0;
                i14 = gVar.f9430t0;
                iArr = new int[2];
                i15 = (size3 - i11) - i12;
                i16 = gVar.V0;
                if (i16 == 1) {
                    i15 = (size4 - i13) - i14;
                }
                i17 = i15;
                if (i16 == 0) {
                    if (gVar.D0 == -1) {
                        i85 = 0;
                        gVar.D0 = 0;
                    } else {
                        i85 = 0;
                    }
                    i18 = i12;
                    if (gVar.E0 == -1) {
                        gVar.E0 = i85;
                    }
                } else {
                    i18 = i12;
                    if (gVar.D0 == -1) {
                        gVar.D0 = 0;
                    }
                    if (gVar.E0 == -1) {
                        gVar.E0 = 0;
                    }
                }
                dVarArr = gVar.f9443q0;
                i19 = 0;
                i20 = 0;
                while (true) {
                    i21 = gVar.f9444r0;
                    i22 = i13;
                    if (i19 < i21) {
                        break;
                    }
                    if (gVar.f9443q0[i19].f9377g0 == 8) {
                        i20++;
                    }
                    i19++;
                    i13 = i22;
                }
                if (i20 > 0) {
                    dVarArr2 = new d[i21 - i20];
                    i83 = 0;
                    i84 = 0;
                    while (i83 < gVar.f9444r0) {
                        dVar12 = gVar.f9443q0[i83];
                        dVarArr9 = dVarArr2;
                        if (dVar12.f9377g0 != 8) {
                            dVarArr9[i84] = dVar12;
                            i84++;
                        }
                        i83++;
                        dVarArr2 = dVarArr9;
                    }
                    i23 = i84;
                } else {
                    i23 = i21;
                    dVarArr2 = dVarArr;
                }
                gVar.a1 = dVarArr2;
                gVar.f9428b1 = i23;
                i24 = gVar.T0;
                if (i24 != 0) {
                    dVarArr3 = dVarArr2;
                    i25 = i23;
                    i26 = i14;
                    iArr2 = iArr;
                    i27 = size4;
                    i11 = i11;
                    i18 = i18;
                    i22 = i22;
                    i28 = gVar.V0;
                    if (i25 == 0) {
                        if (arrayList.size() == 0) {
                            fVar = new f(gVar, i28, gVar.I, gVar.J, gVar.K, gVar.L, i17);
                            arrayList.add(fVar);
                        } else {
                            f fVar8 = (f) arrayList.get(0);
                            fVar8.f9415c = 0;
                            fVar8.f9414b = null;
                            fVar8.f9421l = 0;
                            fVar8.f9422m = 0;
                            fVar8.f9423n = 0;
                            fVar8.f9424o = 0;
                            fVar8.f9425p = 0;
                            fVar8.f(i28, gVar.I, gVar.J, gVar.K, gVar.L, gVar.f9433w0, gVar.f9429s0, gVar.f9434x0, gVar.f9430t0, i17);
                            fVar = fVar8;
                        }
                        for (i29 = 0; i29 < i25; i29++) {
                            fVar.a(dVarArr3[i29]);
                        }
                        c10 = 0;
                        iArr2[0] = fVar.d();
                        c11 = 1;
                        iArr2[1] = fVar.c();
                    }
                    i30 = iArr2[c10] + i11 + i18;
                    i31 = iArr2[c11] + i22 + i26;
                    if (mode != 1073741824) {
                        if (mode == Integer.MIN_VALUE) {
                            size3 = Math.min(i30, size3);
                        } else if (mode == 0) {
                            size3 = i30;
                        } else {
                            size3 = 0;
                        }
                    }
                    if (mode2 == 1073741824) {
                        iMin = i27;
                    } else if (mode2 == Integer.MIN_VALUE) {
                        iMin = Math.min(i31, i27);
                    } else if (mode2 == 0) {
                        iMin = i31;
                    } else {
                        iMin = 0;
                    }
                    gVar.f9436z0 = size3;
                    gVar.A0 = iMin;
                    gVar.O(size3);
                    gVar.L(iMin);
                    if (gVar.f9444r0 > 0) {
                        z4 = c11;
                    } else {
                        z4 = 0;
                    }
                    gVar.f9435y0 = z4;
                } else if (i24 != 1) {
                    if (i24 != 2) {
                        dVarArr5 = dVarArr2;
                        i48 = i23;
                        i26 = i14;
                        iArr2 = iArr;
                        i27 = size4;
                        i11 = i11;
                        i18 = i18;
                        i22 = i22;
                        i49 = gVar.V0;
                        if (i49 == 0) {
                            i58 = gVar.U0;
                            if (i58 <= 0) {
                                i60 = 0;
                                iCeil2 = 0;
                                for (i59 = 0; i59 < i48; i59++) {
                                    if (i59 > 0) {
                                        i60 += gVar.P0;
                                    }
                                    dVar9 = dVarArr5[i59];
                                    if (dVar9 != null) {
                                        iU3 = gVar.U(dVar9, i17) + i60;
                                        if (iU3 > i17) {
                                            break;
                                        }
                                        iCeil2++;
                                        i60 = iU3;
                                    }
                                }
                            } else {
                                iCeil2 = i58;
                            }
                            iCeil = 0;
                        } else {
                            iCeil = gVar.U0;
                            if (iCeil <= 0) {
                                i51 = 0;
                                i52 = 0;
                                for (i50 = 0; i50 < i48; i50++) {
                                    if (i50 > 0) {
                                        i51 += gVar.Q0;
                                    }
                                    dVar3 = dVarArr5[i50];
                                    if (dVar3 != null) {
                                        iT2 = gVar.T(dVar3, i17) + i51;
                                        if (iT2 > i17) {
                                            break;
                                        }
                                        i52++;
                                        i51 = iT2;
                                    }
                                }
                                iCeil = i52;
                            }
                            iCeil2 = 0;
                        }
                        if (gVar.Z0 == null) {
                            gVar.Z0 = new int[2];
                        }
                        z13 = (iCeil != 0 && i49 == 1) || (iCeil2 == 0 && i49 == 0);
                        while (!z13) {
                            if (i49 == 0) {
                                iCeil = (int) Math.ceil(i48 / iCeil2);
                            } else {
                                iCeil2 = (int) Math.ceil(i48 / iCeil);
                            }
                            dVarArr6 = gVar.Y0;
                            if (dVarArr6 != null || dVarArr6.length < iCeil2) {
                                obj = null;
                                gVar.Y0 = new d[iCeil2];
                            } else {
                                obj = null;
                                Arrays.fill(dVarArr6, (Object) null);
                            }
                            dVarArr7 = gVar.X0;
                            if (dVarArr7 != null || dVarArr7.length < iCeil) {
                                gVar.X0 = new d[iCeil];
                            } else {
                                Arrays.fill(dVarArr7, obj);
                            }
                            for (i53 = 0; i53 < iCeil2; i53++) {
                                for (i56 = 0; i56 < iCeil; i56++) {
                                    i57 = (i56 * iCeil2) + i53;
                                    if (i49 == 1) {
                                        i57 = (i53 * iCeil) + i56;
                                    }
                                    if (i57 < dVarArr5.length && (dVar6 = dVarArr5[i57]) != null) {
                                        int iU5 = gVar.U(dVar6, i17);
                                        dVar7 = gVar.Y0[i53];
                                        if (dVar7 != null || dVar7.q() < iU5) {
                                            gVar.Y0[i53] = dVar6;
                                        }
                                        int iT5 = gVar.T(dVar6, i17);
                                        dVar8 = gVar.X0[i56];
                                        if (dVar8 != null || dVar8.k() < iT5) {
                                            gVar.X0[i56] = dVar6;
                                        }
                                    }
                                }
                            }
                            iU2 = 0;
                            for (i54 = 0; i54 < iCeil2; i54++) {
                                dVar5 = gVar.Y0[i54];
                                if (dVar5 == null) {
                                    if (i54 > 0) {
                                        iU2 += gVar.P0;
                                    }
                                    iU2 = gVar.U(dVar5, i17) + iU2;
                                }
                            }
                            iT3 = 0;
                            for (i55 = 0; i55 < iCeil; i55++) {
                                dVar4 = gVar.X0[i55];
                                if (dVar4 == null) {
                                    if (i55 > 0) {
                                        iT3 += gVar.Q0;
                                    }
                                    iT3 = gVar.T(dVar4, i17) + iT3;
                                }
                            }
                            iArr2[0] = iU2;
                            iArr2[1] = iT3;
                            if (i49 == 0) {
                                if (iU2 > i17 || iCeil2 <= 1) {
                                    z13 = true;
                                } else {
                                    iCeil2--;
                                }
                            } else if (iT3 > i17 || iCeil <= 1) {
                                z13 = true;
                            } else {
                                iCeil--;
                            }
                        }
                        c11 = 1;
                        int[] iArr4 = gVar.Z0;
                        iArr4[0] = iCeil2;
                        iArr4[1] = iCeil;
                    } else if (i24 != 3) {
                        i26 = i14;
                        iArr2 = iArr;
                        i27 = size4;
                        i11 = i11;
                        i18 = i18;
                        i22 = i22;
                    } else {
                        i61 = i23;
                        i62 = gVar.V0;
                        if (i61 == 0) {
                            i26 = i14;
                            iArr2 = iArr;
                            i27 = size4;
                            c12 = 1;
                        } else {
                            arrayList.clear();
                            dVarArr8 = dVarArr2;
                            i26 = i14;
                            iArr2 = iArr;
                            c12 = 1;
                            fVar5 = new f(gVar, i62, gVar.I, gVar.J, gVar.K, gVar.L, i17);
                            arrayList.add(fVar5);
                            if (i62 == 0) {
                                i75 = 0;
                                i76 = 0;
                                i66 = 0;
                                i77 = 0;
                                while (i75 < i61) {
                                    i78 = i76 + 1;
                                    dVar11 = dVarArr8[i75];
                                    iU4 = gVar.U(dVar11, i17);
                                    i79 = i62;
                                    i80 = i75;
                                    if (dVar11.f9392p0[0] == 3) {
                                        i66++;
                                    }
                                    int i88 = i66;
                                    z16 = (i77 != i17 || (gVar.P0 + i77) + iU4 > i17) && fVar5.f9414b != null;
                                    if (!z16 && i80 > 0 && (i82 = gVar.U0) > 0 && i78 > i82) {
                                        z16 = true;
                                    }
                                    if (z16) {
                                        i62 = i79;
                                        i81 = i80;
                                        fVar5 = new f(gVar, i62, gVar.I, gVar.J, gVar.K, gVar.L, i17);
                                        fVar5.f9423n = i81;
                                        arrayList.add(fVar5);
                                        i77 = iU4;
                                        i76 = i78;
                                    } else {
                                        i62 = i79;
                                        i81 = i80;
                                        if (i81 > 0) {
                                            i77 = gVar.P0 + iU4 + i77;
                                        } else {
                                            i77 = iU4;
                                        }
                                        i76 = 0;
                                    }
                                    fVar5.a(dVar11);
                                    i75 = i81 + 1;
                                    i66 = i88;
                                    size4 = size4;
                                }
                                i27 = size4;
                            } else {
                                i27 = size4;
                                i63 = 0;
                                i64 = 0;
                                i65 = 0;
                                while (i63 < i61) {
                                    dVar10 = dVarArr8[i63];
                                    iT4 = gVar.T(dVar10, i17);
                                    if (dVar10.f9392p0[1] == 3) {
                                        i64++;
                                    }
                                    int i89 = i64;
                                    z14 = (i65 != i17 || (gVar.Q0 + i65) + iT4 > i17) && fVar5.f9414b != null;
                                    if (!z14 && i63 > 0 && (i67 = gVar.U0) > 0 && i67 < 0) {
                                        z14 = true;
                                    }
                                    if (z14) {
                                        fVar5 = new f(gVar, i62, gVar.I, gVar.J, gVar.K, gVar.L, i17);
                                        fVar5.f9423n = i63;
                                        arrayList.add(fVar5);
                                    } else {
                                        if (i63 > 0) {
                                            i65 = gVar.Q0 + iT4 + i65;
                                        }
                                        fVar5.a(dVar10);
                                        i63++;
                                        i64 = i89;
                                    }
                                    i65 = iT4;
                                    fVar5.a(dVar10);
                                    i63++;
                                    i64 = i89;
                                }
                                i66 = i64;
                            }
                            size2 = arrayList.size();
                            int i90 = gVar.f9433w0;
                            int i91 = gVar.f9429s0;
                            int i92 = gVar.f9434x0;
                            int i93 = gVar.f9430t0;
                            if (iArr3[0] != 2 || iArr3[1] == 2) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (i66 > 0 && z15) {
                                for (i74 = 0; i74 < size2; i74++) {
                                    fVar7 = (f) arrayList.get(i74);
                                    if (i62 == 0) {
                                        fVar7.e(i17 - fVar7.d());
                                    } else {
                                        fVar7.e(i17 - fVar7.c());
                                    }
                                }
                            }
                            i68 = i90;
                            i69 = i91;
                            i70 = i92;
                            i71 = i93;
                            cVar8 = cVar;
                            cVar9 = cVar2;
                            cVar10 = cVar3;
                            cVar11 = cVar15;
                            iMax2 = 0;
                            i73 = 0;
                            for (i72 = 0; i72 < size2; i72++) {
                                fVar6 = (f) arrayList.get(i72);
                                if (i62 == 0) {
                                    if (i72 < size2 - 1) {
                                        cVar10 = ((f) arrayList.get(i72 + 1)).f9414b.J;
                                        i71 = 0;
                                    } else {
                                        i71 = gVar.f9430t0;
                                        cVar10 = cVar3;
                                    }
                                    c cVar19 = fVar6.f9414b.L;
                                    fVar6.f(i62, cVar8, cVar11, cVar9, cVar10, i68, i69, i70, i71, i17);
                                    iMax2 = Math.max(iMax2, fVar6.d());
                                    iC2 = fVar6.c() + i73;
                                    if (i72 > 0) {
                                        iC2 += gVar.Q0;
                                    }
                                    i73 = iC2;
                                    cVar11 = cVar19;
                                    i69 = 0;
                                } else {
                                    if (i72 < size2 - 1) {
                                        cVar9 = ((f) arrayList.get(i72 + 1)).f9414b.I;
                                        i70 = 0;
                                    } else {
                                        i70 = gVar.f9434x0;
                                        cVar9 = cVar2;
                                    }
                                    c cVar20 = fVar6.f9414b.K;
                                    fVar6.f(i62, cVar8, cVar11, cVar9, cVar10, i68, i69, i70, i71, i17);
                                    iD2 = fVar6.d() + iMax2;
                                    int iMax3 = Math.max(i73, fVar6.c());
                                    if (i72 > 0) {
                                        iD2 += gVar.P0;
                                    }
                                    i73 = iMax3;
                                    iMax2 = iD2;
                                    cVar8 = cVar20;
                                    i68 = 0;
                                }
                            }
                            iArr2[0] = iMax2;
                            iArr2[1] = i73;
                        }
                        c11 = c12;
                    }
                    c10 = 0;
                    i30 = iArr2[c10] + i11 + i18;
                    i31 = iArr2[c11] + i22 + i26;
                    if (mode != 1073741824) {
                        if (mode == Integer.MIN_VALUE) {
                            size3 = Math.min(i30, size3);
                        } else if (mode == 0) {
                            size3 = i30;
                        } else {
                            size3 = 0;
                        }
                    }
                    if (mode2 == 1073741824) {
                        iMin = i27;
                    } else if (mode2 == Integer.MIN_VALUE) {
                        iMin = Math.min(i31, i27);
                    } else if (mode2 == 0) {
                        iMin = i31;
                    } else {
                        iMin = 0;
                    }
                    gVar.f9436z0 = size3;
                    gVar.A0 = iMin;
                    gVar.O(size3);
                    gVar.L(iMin);
                    if (gVar.f9444r0 > 0) {
                        z4 = c11;
                    } else {
                        z4 = 0;
                    }
                    gVar.f9435y0 = z4;
                } else {
                    i26 = i14;
                    iArr2 = iArr;
                    i27 = size4;
                    i11 = i11;
                    i18 = i18;
                    i22 = i22;
                    i32 = i23;
                    dVarArr4 = dVarArr2;
                    i33 = gVar.V0;
                    if (i32 != 0) {
                        arrayList.clear();
                        fVar2 = new f(gVar, i33, gVar.I, gVar.J, gVar.K, gVar.L, i17);
                        arrayList.add(fVar2);
                        if (i33 == 0) {
                            i45 = 0;
                            i35 = 0;
                            i46 = 0;
                            while (i45 < i32) {
                                dVar2 = dVarArr4[i45];
                                iU = gVar.U(dVar2, i17);
                                if (dVar2.f9392p0[0] == 3) {
                                    i35++;
                                }
                                int i94 = i35;
                                z12 = (i46 != i17 || (gVar.P0 + i46) + iU > i17) && fVar2.f9414b != null;
                                if (!z12 && i45 > 0 && (i47 = gVar.U0) > 0 && i45 % i47 == 0) {
                                    z12 = true;
                                }
                                if (z12) {
                                    fVar2 = new f(gVar, i33, gVar.I, gVar.J, gVar.K, gVar.L, i17);
                                    fVar2.f9423n = i45;
                                    arrayList.add(fVar2);
                                } else {
                                    if (i45 > 0) {
                                        i46 = gVar.P0 + iU + i46;
                                    }
                                    fVar2.a(dVar2);
                                    i45++;
                                    i35 = i94;
                                }
                                i46 = iU;
                                fVar2.a(dVar2);
                                i45++;
                                i35 = i94;
                            }
                        } else {
                            i34 = 0;
                            i35 = 0;
                            i36 = 0;
                            while (i34 < i32) {
                                dVar = dVarArr4[i34];
                                iT = gVar.T(dVar, i17);
                                if (dVar.f9392p0[1] == 3) {
                                    i35++;
                                }
                                int i95 = i35;
                                z10 = (i36 != i17 || (gVar.Q0 + i36) + iT > i17) && fVar2.f9414b != null;
                                if (!z10 && i34 > 0 && (i37 = gVar.U0) > 0 && i34 % i37 == 0) {
                                    z10 = true;
                                }
                                if (z10) {
                                    fVar2 = new f(gVar, i33, gVar.I, gVar.J, gVar.K, gVar.L, i17);
                                    fVar2.f9423n = i34;
                                    arrayList.add(fVar2);
                                } else {
                                    if (i34 > 0) {
                                        i36 = gVar.Q0 + iT + i36;
                                    }
                                    fVar2.a(dVar);
                                    i34++;
                                    i35 = i95;
                                }
                                i36 = iT;
                                fVar2.a(dVar);
                                i34++;
                                i35 = i95;
                            }
                        }
                        size = arrayList.size();
                        int i96 = gVar.f9433w0;
                        int i97 = gVar.f9429s0;
                        int i98 = gVar.f9434x0;
                        int i99 = gVar.f9430t0;
                        if (iArr3[0] != 2 || iArr3[1] == 2) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i35 > 0 && z11) {
                            for (i44 = 0; i44 < size; i44++) {
                                fVar4 = (f) arrayList.get(i44);
                                if (i33 == 0) {
                                    fVar4.e(i17 - fVar4.d());
                                } else {
                                    fVar4.e(i17 - fVar4.c());
                                }
                            }
                        }
                        i38 = i96;
                        i39 = i97;
                        i40 = i98;
                        i41 = i99;
                        cVar4 = cVar;
                        cVar5 = cVar2;
                        cVar6 = cVar3;
                        cVar7 = cVar15;
                        iMax = 0;
                        i43 = 0;
                        for (i42 = 0; i42 < size; i42++) {
                            fVar3 = (f) arrayList.get(i42);
                            if (i33 == 0) {
                                if (i42 < size - 1) {
                                    cVar6 = ((f) arrayList.get(i42 + 1)).f9414b.J;
                                    i41 = 0;
                                } else {
                                    i41 = gVar.f9430t0;
                                    cVar6 = cVar3;
                                }
                                c cVar21 = fVar3.f9414b.L;
                                fVar3.f(i33, cVar4, cVar7, cVar5, cVar6, i38, i39, i40, i41, i17);
                                iMax = Math.max(iMax, fVar3.d());
                                iC = fVar3.c() + i43;
                                if (i42 > 0) {
                                    iC += gVar.Q0;
                                }
                                i43 = iC;
                                cVar7 = cVar21;
                                i39 = 0;
                            } else {
                                if (i42 < size - 1) {
                                    cVar5 = ((f) arrayList.get(i42 + 1)).f9414b.I;
                                    i40 = 0;
                                } else {
                                    i40 = gVar.f9434x0;
                                    cVar5 = cVar2;
                                }
                                c cVar22 = fVar3.f9414b.K;
                                fVar3.f(i33, cVar4, cVar7, cVar5, cVar6, i38, i39, i40, i41, i17);
                                iD = fVar3.d() + iMax;
                                int iMax4 = Math.max(i43, fVar3.c());
                                if (i42 > 0) {
                                    iD += gVar.P0;
                                }
                                i43 = iMax4;
                                iMax = iD;
                                cVar4 = cVar22;
                                i38 = 0;
                            }
                        }
                        iArr2[0] = iMax;
                        iArr2[1] = i43;
                    }
                }
                c11 = 1;
                c10 = 0;
                i30 = iArr2[c10] + i11 + i18;
                i31 = iArr2[c11] + i22 + i26;
                if (mode != 1073741824) {
                    if (mode == Integer.MIN_VALUE) {
                        size3 = Math.min(i30, size3);
                    } else if (mode == 0) {
                        size3 = i30;
                    } else {
                        size3 = 0;
                    }
                }
                if (mode2 == 1073741824) {
                    iMin = i27;
                } else if (mode2 == Integer.MIN_VALUE) {
                    iMin = Math.min(i31, i27);
                } else if (mode2 == 0) {
                    iMin = i31;
                } else {
                    iMin = 0;
                }
                gVar.f9436z0 = size3;
                gVar.A0 = iMin;
                gVar.O(size3);
                gVar.L(iMin);
                if (gVar.f9444r0 > 0) {
                    z4 = c11;
                } else {
                    z4 = 0;
                }
                gVar.f9435y0 = z4;
            }
        } else {
            cVar = cVar16;
            cVar2 = cVar17;
            cVar3 = cVar18;
            arrayList = arrayList3;
            i11 = gVar.f9433w0;
            i12 = gVar.f9434x0;
            i13 = gVar.f9429s0;
            i14 = gVar.f9430t0;
            iArr = new int[2];
            i15 = (size3 - i11) - i12;
            i16 = gVar.V0;
            if (i16 == 1) {
                i15 = (size4 - i13) - i14;
            }
            i17 = i15;
            if (i16 == 0) {
                if (gVar.D0 == -1) {
                    i85 = 0;
                    gVar.D0 = 0;
                } else {
                    i85 = 0;
                }
                i18 = i12;
                if (gVar.E0 == -1) {
                    gVar.E0 = i85;
                }
            } else {
                i18 = i12;
                if (gVar.D0 == -1) {
                    gVar.D0 = 0;
                }
                if (gVar.E0 == -1) {
                    gVar.E0 = 0;
                }
            }
            dVarArr = gVar.f9443q0;
            i19 = 0;
            i20 = 0;
            while (true) {
                i21 = gVar.f9444r0;
                i22 = i13;
                if (i19 < i21) {
                    break;
                    break;
                }
                if (gVar.f9443q0[i19].f9377g0 == 8) {
                    i20++;
                }
                i19++;
                i13 = i22;
            }
            if (i20 > 0) {
                dVarArr2 = new d[i21 - i20];
                i83 = 0;
                i84 = 0;
                while (i83 < gVar.f9444r0) {
                    dVar12 = gVar.f9443q0[i83];
                    dVarArr9 = dVarArr2;
                    if (dVar12.f9377g0 != 8) {
                        dVarArr9[i84] = dVar12;
                        i84++;
                    }
                    i83++;
                    dVarArr2 = dVarArr9;
                }
                i23 = i84;
            } else {
                i23 = i21;
                dVarArr2 = dVarArr;
            }
            gVar.a1 = dVarArr2;
            gVar.f9428b1 = i23;
            i24 = gVar.T0;
            if (i24 != 0) {
                dVarArr3 = dVarArr2;
                i25 = i23;
                i26 = i14;
                iArr2 = iArr;
                i27 = size4;
                i11 = i11;
                i18 = i18;
                i22 = i22;
                i28 = gVar.V0;
                if (i25 == 0) {
                    if (arrayList.size() == 0) {
                        fVar = new f(gVar, i28, gVar.I, gVar.J, gVar.K, gVar.L, i17);
                        arrayList.add(fVar);
                    } else {
                        f fVar9 = (f) arrayList.get(0);
                        fVar9.f9415c = 0;
                        fVar9.f9414b = null;
                        fVar9.f9421l = 0;
                        fVar9.f9422m = 0;
                        fVar9.f9423n = 0;
                        fVar9.f9424o = 0;
                        fVar9.f9425p = 0;
                        fVar9.f(i28, gVar.I, gVar.J, gVar.K, gVar.L, gVar.f9433w0, gVar.f9429s0, gVar.f9434x0, gVar.f9430t0, i17);
                        fVar = fVar9;
                    }
                    while (i29 < i25) {
                        fVar.a(dVarArr3[i29]);
                    }
                    c10 = 0;
                    iArr2[0] = fVar.d();
                    c11 = 1;
                    iArr2[1] = fVar.c();
                }
                i30 = iArr2[c10] + i11 + i18;
                i31 = iArr2[c11] + i22 + i26;
                if (mode != 1073741824) {
                    if (mode == Integer.MIN_VALUE) {
                        size3 = Math.min(i30, size3);
                    } else if (mode == 0) {
                        size3 = i30;
                    } else {
                        size3 = 0;
                    }
                }
                if (mode2 == 1073741824) {
                    iMin = i27;
                } else if (mode2 == Integer.MIN_VALUE) {
                    iMin = Math.min(i31, i27);
                } else if (mode2 == 0) {
                    iMin = i31;
                } else {
                    iMin = 0;
                }
                gVar.f9436z0 = size3;
                gVar.A0 = iMin;
                gVar.O(size3);
                gVar.L(iMin);
                if (gVar.f9444r0 > 0) {
                    z4 = c11;
                } else {
                    z4 = 0;
                }
                gVar.f9435y0 = z4;
            } else if (i24 != 1) {
                if (i24 != 2) {
                    dVarArr5 = dVarArr2;
                    i48 = i23;
                    i26 = i14;
                    iArr2 = iArr;
                    i27 = size4;
                    i11 = i11;
                    i18 = i18;
                    i22 = i22;
                    i49 = gVar.V0;
                    if (i49 == 0) {
                        i58 = gVar.U0;
                        if (i58 <= 0) {
                            i60 = 0;
                            iCeil2 = 0;
                            while (i59 < i48) {
                                if (i59 > 0) {
                                    i60 += gVar.P0;
                                }
                                dVar9 = dVarArr5[i59];
                                if (dVar9 != null) {
                                    iU3 = gVar.U(dVar9, i17) + i60;
                                    if (iU3 > i17) {
                                        break;
                                        break;
                                    } else {
                                        iCeil2++;
                                        i60 = iU3;
                                    }
                                }
                            }
                        } else {
                            iCeil2 = i58;
                        }
                        iCeil = 0;
                    } else {
                        iCeil = gVar.U0;
                        if (iCeil <= 0) {
                            i51 = 0;
                            i52 = 0;
                            while (i50 < i48) {
                                if (i50 > 0) {
                                    i51 += gVar.Q0;
                                }
                                dVar3 = dVarArr5[i50];
                                if (dVar3 != null) {
                                    iT2 = gVar.T(dVar3, i17) + i51;
                                    if (iT2 > i17) {
                                        break;
                                        break;
                                    } else {
                                        i52++;
                                        i51 = iT2;
                                    }
                                }
                            }
                            iCeil = i52;
                        }
                        iCeil2 = 0;
                    }
                    if (gVar.Z0 == null) {
                        gVar.Z0 = new int[2];
                    }
                    if (iCeil != 0) {
                    }
                    while (!z13) {
                        if (i49 == 0) {
                            iCeil = (int) Math.ceil(i48 / iCeil2);
                        } else {
                            iCeil2 = (int) Math.ceil(i48 / iCeil);
                        }
                        dVarArr6 = gVar.Y0;
                        if (dVarArr6 != null) {
                            obj = null;
                            gVar.Y0 = new d[iCeil2];
                        } else {
                            obj = null;
                            gVar.Y0 = new d[iCeil2];
                        }
                        dVarArr7 = gVar.X0;
                        if (dVarArr7 != null) {
                            gVar.X0 = new d[iCeil];
                        } else {
                            gVar.X0 = new d[iCeil];
                        }
                        while (i53 < iCeil2) {
                            while (i56 < iCeil) {
                                i57 = (i56 * iCeil2) + i53;
                                if (i49 == 1) {
                                    i57 = (i53 * iCeil) + i56;
                                }
                                if (i57 < dVarArr5.length) {
                                    int iU6 = gVar.U(dVar6, i17);
                                    dVar7 = gVar.Y0[i53];
                                    if (dVar7 != null) {
                                        gVar.Y0[i53] = dVar6;
                                    } else {
                                        gVar.Y0[i53] = dVar6;
                                    }
                                    int iT6 = gVar.T(dVar6, i17);
                                    dVar8 = gVar.X0[i56];
                                    if (dVar8 != null) {
                                        gVar.X0[i56] = dVar6;
                                    } else {
                                        gVar.X0[i56] = dVar6;
                                    }
                                }
                            }
                        }
                        iU2 = 0;
                        while (i54 < iCeil2) {
                            dVar5 = gVar.Y0[i54];
                            if (dVar5 == null) {
                                if (i54 > 0) {
                                    iU2 += gVar.P0;
                                }
                                iU2 = gVar.U(dVar5, i17) + iU2;
                            }
                        }
                        iT3 = 0;
                        while (i55 < iCeil) {
                            dVar4 = gVar.X0[i55];
                            if (dVar4 == null) {
                                if (i55 > 0) {
                                    iT3 += gVar.Q0;
                                }
                                iT3 = gVar.T(dVar4, i17) + iT3;
                            }
                        }
                        iArr2[0] = iU2;
                        iArr2[1] = iT3;
                        if (i49 == 0) {
                            if (iU2 > i17) {
                            }
                            z13 = true;
                        } else {
                            if (iT3 > i17) {
                            }
                            z13 = true;
                        }
                    }
                    c11 = 1;
                    int[] iArr5 = gVar.Z0;
                    iArr5[0] = iCeil2;
                    iArr5[1] = iCeil;
                } else if (i24 != 3) {
                    i26 = i14;
                    iArr2 = iArr;
                    i27 = size4;
                    i11 = i11;
                    i18 = i18;
                    i22 = i22;
                } else {
                    i61 = i23;
                    i62 = gVar.V0;
                    if (i61 == 0) {
                        i26 = i14;
                        iArr2 = iArr;
                        i27 = size4;
                        c12 = 1;
                    } else {
                        arrayList.clear();
                        dVarArr8 = dVarArr2;
                        i26 = i14;
                        iArr2 = iArr;
                        c12 = 1;
                        fVar5 = new f(gVar, i62, gVar.I, gVar.J, gVar.K, gVar.L, i17);
                        arrayList.add(fVar5);
                        if (i62 == 0) {
                            i75 = 0;
                            i76 = 0;
                            i66 = 0;
                            i77 = 0;
                            while (i75 < i61) {
                                i78 = i76 + 1;
                                dVar11 = dVarArr8[i75];
                                iU4 = gVar.U(dVar11, i17);
                                i79 = i62;
                                i80 = i75;
                                if (dVar11.f9392p0[0] == 3) {
                                    i66++;
                                }
                                int i810 = i66;
                                if (i77 != i17) {
                                }
                                if (!z16) {
                                    z16 = true;
                                }
                                if (z16) {
                                    i62 = i79;
                                    i81 = i80;
                                    fVar5 = new f(gVar, i62, gVar.I, gVar.J, gVar.K, gVar.L, i17);
                                    fVar5.f9423n = i81;
                                    arrayList.add(fVar5);
                                    i77 = iU4;
                                    i76 = i78;
                                } else {
                                    i62 = i79;
                                    i81 = i80;
                                    if (i81 > 0) {
                                        i77 = gVar.P0 + iU4 + i77;
                                    } else {
                                        i77 = iU4;
                                    }
                                    i76 = 0;
                                }
                                fVar5.a(dVar11);
                                i75 = i81 + 1;
                                i66 = i810;
                                size4 = size4;
                            }
                            i27 = size4;
                        } else {
                            i27 = size4;
                            i63 = 0;
                            i64 = 0;
                            i65 = 0;
                            while (i63 < i61) {
                                dVar10 = dVarArr8[i63];
                                iT4 = gVar.T(dVar10, i17);
                                if (dVar10.f9392p0[1] == 3) {
                                    i64++;
                                }
                                int i811 = i64;
                                if (i65 != i17) {
                                }
                                if (!z14) {
                                    z14 = true;
                                }
                                if (z14) {
                                    fVar5 = new f(gVar, i62, gVar.I, gVar.J, gVar.K, gVar.L, i17);
                                    fVar5.f9423n = i63;
                                    arrayList.add(fVar5);
                                } else {
                                    if (i63 > 0) {
                                        i65 = gVar.Q0 + iT4 + i65;
                                    }
                                    fVar5.a(dVar10);
                                    i63++;
                                    i64 = i811;
                                }
                                i65 = iT4;
                                fVar5.a(dVar10);
                                i63++;
                                i64 = i811;
                            }
                            i66 = i64;
                        }
                        size2 = arrayList.size();
                        int i910 = gVar.f9433w0;
                        int i911 = gVar.f9429s0;
                        int i912 = gVar.f9434x0;
                        int i913 = gVar.f9430t0;
                        if (iArr3[0] != 2) {
                            z15 = true;
                        } else {
                            z15 = true;
                        }
                        if (i66 > 0) {
                            while (i74 < size2) {
                                fVar7 = (f) arrayList.get(i74);
                                if (i62 == 0) {
                                    fVar7.e(i17 - fVar7.d());
                                } else {
                                    fVar7.e(i17 - fVar7.c());
                                }
                            }
                        }
                        i68 = i910;
                        i69 = i911;
                        i70 = i912;
                        i71 = i913;
                        cVar8 = cVar;
                        cVar9 = cVar2;
                        cVar10 = cVar3;
                        cVar11 = cVar15;
                        iMax2 = 0;
                        i73 = 0;
                        while (i72 < size2) {
                            fVar6 = (f) arrayList.get(i72);
                            if (i62 == 0) {
                                if (i72 < size2 - 1) {
                                    cVar10 = ((f) arrayList.get(i72 + 1)).f9414b.J;
                                    i71 = 0;
                                } else {
                                    i71 = gVar.f9430t0;
                                    cVar10 = cVar3;
                                }
                                c cVar110 = fVar6.f9414b.L;
                                fVar6.f(i62, cVar8, cVar11, cVar9, cVar10, i68, i69, i70, i71, i17);
                                iMax2 = Math.max(iMax2, fVar6.d());
                                iC2 = fVar6.c() + i73;
                                if (i72 > 0) {
                                    iC2 += gVar.Q0;
                                }
                                i73 = iC2;
                                cVar11 = cVar110;
                                i69 = 0;
                            } else {
                                if (i72 < size2 - 1) {
                                    cVar9 = ((f) arrayList.get(i72 + 1)).f9414b.I;
                                    i70 = 0;
                                } else {
                                    i70 = gVar.f9434x0;
                                    cVar9 = cVar2;
                                }
                                c cVar23 = fVar6.f9414b.K;
                                fVar6.f(i62, cVar8, cVar11, cVar9, cVar10, i68, i69, i70, i71, i17);
                                iD2 = fVar6.d() + iMax2;
                                int iMax5 = Math.max(i73, fVar6.c());
                                if (i72 > 0) {
                                    iD2 += gVar.P0;
                                }
                                i73 = iMax5;
                                iMax2 = iD2;
                                cVar8 = cVar23;
                                i68 = 0;
                            }
                        }
                        iArr2[0] = iMax2;
                        iArr2[1] = i73;
                    }
                    c11 = c12;
                }
                c10 = 0;
                i30 = iArr2[c10] + i11 + i18;
                i31 = iArr2[c11] + i22 + i26;
                if (mode != 1073741824) {
                    if (mode == Integer.MIN_VALUE) {
                        size3 = Math.min(i30, size3);
                    } else if (mode == 0) {
                        size3 = i30;
                    } else {
                        size3 = 0;
                    }
                }
                if (mode2 == 1073741824) {
                    iMin = i27;
                } else if (mode2 == Integer.MIN_VALUE) {
                    iMin = Math.min(i31, i27);
                } else if (mode2 == 0) {
                    iMin = i31;
                } else {
                    iMin = 0;
                }
                gVar.f9436z0 = size3;
                gVar.A0 = iMin;
                gVar.O(size3);
                gVar.L(iMin);
                if (gVar.f9444r0 > 0) {
                    z4 = c11;
                } else {
                    z4 = 0;
                }
                gVar.f9435y0 = z4;
            } else {
                i26 = i14;
                iArr2 = iArr;
                i27 = size4;
                i11 = i11;
                i18 = i18;
                i22 = i22;
                i32 = i23;
                dVarArr4 = dVarArr2;
                i33 = gVar.V0;
                if (i32 != 0) {
                    arrayList.clear();
                    fVar2 = new f(gVar, i33, gVar.I, gVar.J, gVar.K, gVar.L, i17);
                    arrayList.add(fVar2);
                    if (i33 == 0) {
                        i45 = 0;
                        i35 = 0;
                        i46 = 0;
                        while (i45 < i32) {
                            dVar2 = dVarArr4[i45];
                            iU = gVar.U(dVar2, i17);
                            if (dVar2.f9392p0[0] == 3) {
                                i35++;
                            }
                            int i914 = i35;
                            if (i46 != i17) {
                            }
                            if (!z12) {
                                z12 = true;
                            }
                            if (z12) {
                                fVar2 = new f(gVar, i33, gVar.I, gVar.J, gVar.K, gVar.L, i17);
                                fVar2.f9423n = i45;
                                arrayList.add(fVar2);
                            } else {
                                if (i45 > 0) {
                                    i46 = gVar.P0 + iU + i46;
                                }
                                fVar2.a(dVar2);
                                i45++;
                                i35 = i914;
                            }
                            i46 = iU;
                            fVar2.a(dVar2);
                            i45++;
                            i35 = i914;
                        }
                    } else {
                        i34 = 0;
                        i35 = 0;
                        i36 = 0;
                        while (i34 < i32) {
                            dVar = dVarArr4[i34];
                            iT = gVar.T(dVar, i17);
                            if (dVar.f9392p0[1] == 3) {
                                i35++;
                            }
                            int i915 = i35;
                            if (i36 != i17) {
                            }
                            if (!z10) {
                                z10 = true;
                            }
                            if (z10) {
                                fVar2 = new f(gVar, i33, gVar.I, gVar.J, gVar.K, gVar.L, i17);
                                fVar2.f9423n = i34;
                                arrayList.add(fVar2);
                            } else {
                                if (i34 > 0) {
                                    i36 = gVar.Q0 + iT + i36;
                                }
                                fVar2.a(dVar);
                                i34++;
                                i35 = i915;
                            }
                            i36 = iT;
                            fVar2.a(dVar);
                            i34++;
                            i35 = i915;
                        }
                    }
                    size = arrayList.size();
                    int i916 = gVar.f9433w0;
                    int i917 = gVar.f9429s0;
                    int i918 = gVar.f9434x0;
                    int i919 = gVar.f9430t0;
                    if (iArr3[0] != 2) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (i35 > 0) {
                        while (i44 < size) {
                            fVar4 = (f) arrayList.get(i44);
                            if (i33 == 0) {
                                fVar4.e(i17 - fVar4.d());
                            } else {
                                fVar4.e(i17 - fVar4.c());
                            }
                        }
                    }
                    i38 = i916;
                    i39 = i917;
                    i40 = i918;
                    i41 = i919;
                    cVar4 = cVar;
                    cVar5 = cVar2;
                    cVar6 = cVar3;
                    cVar7 = cVar15;
                    iMax = 0;
                    i43 = 0;
                    while (i42 < size) {
                        fVar3 = (f) arrayList.get(i42);
                        if (i33 == 0) {
                            if (i42 < size - 1) {
                                cVar6 = ((f) arrayList.get(i42 + 1)).f9414b.J;
                                i41 = 0;
                            } else {
                                i41 = gVar.f9430t0;
                                cVar6 = cVar3;
                            }
                            c cVar24 = fVar3.f9414b.L;
                            fVar3.f(i33, cVar4, cVar7, cVar5, cVar6, i38, i39, i40, i41, i17);
                            iMax = Math.max(iMax, fVar3.d());
                            iC = fVar3.c() + i43;
                            if (i42 > 0) {
                                iC += gVar.Q0;
                            }
                            i43 = iC;
                            cVar7 = cVar24;
                            i39 = 0;
                        } else {
                            if (i42 < size - 1) {
                                cVar5 = ((f) arrayList.get(i42 + 1)).f9414b.I;
                                i40 = 0;
                            } else {
                                i40 = gVar.f9434x0;
                                cVar5 = cVar2;
                            }
                            c cVar25 = fVar3.f9414b.K;
                            fVar3.f(i33, cVar4, cVar7, cVar5, cVar6, i38, i39, i40, i41, i17);
                            iD = fVar3.d() + iMax;
                            int iMax6 = Math.max(i43, fVar3.c());
                            if (i42 > 0) {
                                iD += gVar.P0;
                            }
                            i43 = iMax6;
                            iMax = iD;
                            cVar4 = cVar25;
                            i38 = 0;
                        }
                    }
                    iArr2[0] = iMax;
                    iArr2[1] = i43;
                }
            }
            c11 = 1;
            c10 = 0;
            i30 = iArr2[c10] + i11 + i18;
            i31 = iArr2[c11] + i22 + i26;
            if (mode != 1073741824) {
                if (mode == Integer.MIN_VALUE) {
                    size3 = Math.min(i30, size3);
                } else if (mode == 0) {
                    size3 = i30;
                } else {
                    size3 = 0;
                }
            }
            if (mode2 == 1073741824) {
                iMin = i27;
            } else if (mode2 == Integer.MIN_VALUE) {
                iMin = Math.min(i31, i27);
            } else if (mode2 == 0) {
                iMin = i31;
            } else {
                iMin = 0;
            }
            gVar.f9436z0 = size3;
            gVar.A0 = iMin;
            gVar.O(size3);
            gVar.L(iMin);
            if (gVar.f9444r0 > 0) {
                z4 = c11;
            } else {
                z4 = 0;
            }
            gVar.f9435y0 = z4;
        }
        setMeasuredDimension(gVar.f9436z0, gVar.A0);
    }

    @Override // z.b, android.view.View
    public final void onMeasure(int i, int i10) {
        j(this.f547u, i, i10);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f547u.L0 = f10;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f547u.F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f547u.M0 = f10;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f547u.G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f547u.R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f547u.J0 = f10;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f547u.P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f547u.D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f547u.N0 = f10;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f547u.H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f547u.O0 = f10;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f547u.I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f547u.U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f547u.V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        g gVar = this.f547u;
        gVar.f9429s0 = i;
        gVar.f9430t0 = i;
        gVar.f9431u0 = i;
        gVar.f9432v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f547u.f9430t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f547u.f9433w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f547u.f9434x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f547u.f9429s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f547u.S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f547u.K0 = f10;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f547u.Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f547u.E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f547u.T0 = i;
        requestLayout();
    }
}
