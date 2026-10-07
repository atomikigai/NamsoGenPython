package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.webkit.TracingConfig;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbbs;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f10847d = {0, 4, 8};
    public static final SparseIntArray e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f10848f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f10849a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10850b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f10851c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f10848f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(Barrier barrier, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i10 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = p.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.f562x;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f562x.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i10] = iIntValue;
            i++;
            i10++;
        }
        return i10 != strArrSplit.length ? Arrays.copyOf(iArr, i10) : iArr;
    }

    public static h d(Context context, AttributeSet attributeSet, boolean z4) {
        int i;
        int i10;
        h hVar = new h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z4 ? q.f10855c : q.f10853a);
        k kVar = hVar.f10783b;
        l lVar = hVar.e;
        j jVar = hVar.f10784c;
        i iVar = hVar.f10785d;
        int[] iArr = f10847d;
        String[] strArr = v.a.f9104a;
        SparseIntArray sparseIntArray = e;
        if (z4) {
            g gVar = new g();
            gVar.f10773a = new int[10];
            gVar.f10774b = new int[10];
            gVar.f10775c = 0;
            gVar.f10776d = new int[10];
            gVar.e = new float[10];
            gVar.f10777f = 0;
            gVar.f10778g = new int[5];
            gVar.h = new String[5];
            gVar.i = 0;
            gVar.f10779j = new int[4];
            gVar.f10780k = new boolean[4];
            gVar.f10781l = 0;
            jVar.getClass();
            iVar.getClass();
            lVar.getClass();
            int i11 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i11 < indexCount; indexCount = i10) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                int i12 = i11;
                switch (f10848f.get(index)) {
                    case 2:
                        i10 = indexCount;
                        gVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.I));
                        continue;
                        i11 = i12 + 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case ModuleDescriptor.MODULE_VERSION /* 92 */:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i10 = indexCount;
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 5:
                        i10 = indexCount;
                        gVar.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i11 = i12 + 1;
                        break;
                    case 6:
                        i10 = indexCount;
                        gVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, iVar.C));
                        break;
                    case 7:
                        i10 = indexCount;
                        gVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, iVar.D));
                        break;
                    case 8:
                        i10 = indexCount;
                        gVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.J));
                        break;
                    case 11:
                        i10 = indexCount;
                        gVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.P));
                        break;
                    case 12:
                        i10 = indexCount;
                        gVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.Q));
                        break;
                    case 13:
                        i10 = indexCount;
                        gVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.M));
                        break;
                    case 14:
                        i10 = indexCount;
                        gVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.O));
                        break;
                    case 15:
                        i10 = indexCount;
                        gVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.R));
                        break;
                    case 16:
                        i10 = indexCount;
                        gVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.N));
                        break;
                    case 17:
                        i10 = indexCount;
                        gVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, iVar.f10794d));
                        break;
                    case 18:
                        i10 = indexCount;
                        gVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, iVar.e));
                        break;
                    case 19:
                        i10 = indexCount;
                        gVar.a(19, typedArrayObtainStyledAttributes.getFloat(index, iVar.f10797f));
                        break;
                    case 20:
                        i10 = indexCount;
                        gVar.a(20, typedArrayObtainStyledAttributes.getFloat(index, iVar.f10821w));
                        break;
                    case zzbbs.zzt.zzm /* 21 */:
                        i10 = indexCount;
                        gVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, iVar.f10792c));
                        break;
                    case 22:
                        i10 = indexCount;
                        gVar.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, kVar.f10832a)]);
                        break;
                    case 23:
                        i10 = indexCount;
                        gVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, iVar.f10790b));
                        break;
                    case 24:
                        i10 = indexCount;
                        gVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.F));
                        break;
                    case 27:
                        i10 = indexCount;
                        gVar.b(27, typedArrayObtainStyledAttributes.getInt(index, iVar.E));
                        break;
                    case 28:
                        i10 = indexCount;
                        gVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.G));
                        break;
                    case 31:
                        i10 = indexCount;
                        gVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.K));
                        break;
                    case 34:
                        i10 = indexCount;
                        gVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.H));
                        break;
                    case 37:
                        i10 = indexCount;
                        gVar.a(37, typedArrayObtainStyledAttributes.getFloat(index, iVar.f10822x));
                        break;
                    case 38:
                        i10 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, hVar.f10782a);
                        hVar.f10782a = resourceId;
                        gVar.b(38, resourceId);
                        break;
                    case 39:
                        i10 = indexCount;
                        gVar.a(39, typedArrayObtainStyledAttributes.getFloat(index, iVar.U));
                        break;
                    case 40:
                        i10 = indexCount;
                        gVar.a(40, typedArrayObtainStyledAttributes.getFloat(index, iVar.T));
                        break;
                    case 41:
                        i10 = indexCount;
                        gVar.b(41, typedArrayObtainStyledAttributes.getInt(index, iVar.V));
                        break;
                    case 42:
                        i10 = indexCount;
                        gVar.b(42, typedArrayObtainStyledAttributes.getInt(index, iVar.W));
                        break;
                    case 43:
                        i10 = indexCount;
                        gVar.a(43, typedArrayObtainStyledAttributes.getFloat(index, kVar.f10834c));
                        break;
                    case 44:
                        i10 = indexCount;
                        gVar.d(44, true);
                        gVar.a(44, typedArrayObtainStyledAttributes.getDimension(index, lVar.f10846m));
                        break;
                    case 45:
                        i10 = indexCount;
                        gVar.a(45, typedArrayObtainStyledAttributes.getFloat(index, lVar.f10838b));
                        break;
                    case 46:
                        i10 = indexCount;
                        gVar.a(46, typedArrayObtainStyledAttributes.getFloat(index, lVar.f10839c));
                        break;
                    case 47:
                        i10 = indexCount;
                        gVar.a(47, typedArrayObtainStyledAttributes.getFloat(index, lVar.f10840d));
                        break;
                    case 48:
                        i10 = indexCount;
                        gVar.a(48, typedArrayObtainStyledAttributes.getFloat(index, lVar.e));
                        break;
                    case 49:
                        i10 = indexCount;
                        gVar.a(49, typedArrayObtainStyledAttributes.getDimension(index, lVar.f10841f));
                        break;
                    case 50:
                        i10 = indexCount;
                        gVar.a(50, typedArrayObtainStyledAttributes.getDimension(index, lVar.f10842g));
                        break;
                    case 51:
                        i10 = indexCount;
                        gVar.a(51, typedArrayObtainStyledAttributes.getDimension(index, lVar.i));
                        break;
                    case 52:
                        i10 = indexCount;
                        gVar.a(52, typedArrayObtainStyledAttributes.getDimension(index, lVar.f10843j));
                        break;
                    case 53:
                        i10 = indexCount;
                        gVar.a(53, typedArrayObtainStyledAttributes.getDimension(index, lVar.f10844k));
                        break;
                    case 54:
                        i10 = indexCount;
                        gVar.b(54, typedArrayObtainStyledAttributes.getInt(index, iVar.X));
                        break;
                    case 55:
                        i10 = indexCount;
                        gVar.b(55, typedArrayObtainStyledAttributes.getInt(index, iVar.Y));
                        break;
                    case 56:
                        i10 = indexCount;
                        gVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.Z));
                        break;
                    case 57:
                        i10 = indexCount;
                        gVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f10789a0));
                        break;
                    case 58:
                        i10 = indexCount;
                        gVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f10791b0));
                        break;
                    case 59:
                        i10 = indexCount;
                        gVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f10793c0));
                        break;
                    case 60:
                        i10 = indexCount;
                        gVar.a(60, typedArrayObtainStyledAttributes.getFloat(index, lVar.f10837a));
                        break;
                    case 62:
                        i10 = indexCount;
                        gVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.A));
                        break;
                    case 63:
                        i10 = indexCount;
                        gVar.a(63, typedArrayObtainStyledAttributes.getFloat(index, iVar.B));
                        break;
                    case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                        i10 = indexCount;
                        gVar.b(64, g(typedArrayObtainStyledAttributes, index, jVar.f10826a));
                        break;
                    case 65:
                        i10 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            gVar.c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            gVar.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        i10 = indexCount;
                        gVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i10 = indexCount;
                        gVar.a(67, typedArrayObtainStyledAttributes.getFloat(index, jVar.e));
                        break;
                    case 68:
                        i10 = indexCount;
                        gVar.a(68, typedArrayObtainStyledAttributes.getFloat(index, kVar.f10835d));
                        break;
                    case 69:
                        i10 = indexCount;
                        gVar.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i10 = indexCount;
                        gVar.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i10 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i10 = indexCount;
                        gVar.b(72, typedArrayObtainStyledAttributes.getInt(index, iVar.f10798f0));
                        break;
                    case 73:
                        i10 = indexCount;
                        gVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f10800g0));
                        break;
                    case 74:
                        i10 = indexCount;
                        gVar.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i10 = indexCount;
                        gVar.d(75, typedArrayObtainStyledAttributes.getBoolean(index, iVar.f10811n0));
                        break;
                    case 76:
                        i10 = indexCount;
                        gVar.b(76, typedArrayObtainStyledAttributes.getInt(index, jVar.f10828c));
                        break;
                    case 77:
                        i10 = indexCount;
                        gVar.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i10 = indexCount;
                        gVar.b(78, typedArrayObtainStyledAttributes.getInt(index, kVar.f10833b));
                        break;
                    case 79:
                        i10 = indexCount;
                        gVar.a(79, typedArrayObtainStyledAttributes.getFloat(index, jVar.f10829d));
                        break;
                    case 80:
                        i10 = indexCount;
                        gVar.d(80, typedArrayObtainStyledAttributes.getBoolean(index, iVar.f10807l0));
                        break;
                    case 81:
                        i10 = indexCount;
                        gVar.d(81, typedArrayObtainStyledAttributes.getBoolean(index, iVar.f10809m0));
                        break;
                    case 82:
                        i10 = indexCount;
                        gVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, jVar.f10827b));
                        break;
                    case 83:
                        i10 = indexCount;
                        gVar.b(83, g(typedArrayObtainStyledAttributes, index, lVar.h));
                        break;
                    case 84:
                        i10 = indexCount;
                        gVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, jVar.f10831g));
                        break;
                    case 85:
                        i10 = indexCount;
                        gVar.a(85, typedArrayObtainStyledAttributes.getFloat(index, jVar.f10830f));
                        break;
                    case 86:
                        i10 = indexCount;
                        int i13 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i13 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            jVar.i = resourceId2;
                            gVar.b(89, resourceId2);
                            if (jVar.i != -1) {
                                gVar.b(88, -2);
                            }
                        } else if (i13 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            jVar.h = string;
                            gVar.c(90, string);
                            if (jVar.h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                jVar.i = resourceId3;
                                gVar.b(89, resourceId3);
                                gVar.b(88, -2);
                            } else {
                                gVar.b(88, -1);
                            }
                        } else {
                            gVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, jVar.i));
                        }
                        break;
                    case 87:
                        i10 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i10 = indexCount;
                        gVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.L));
                        break;
                    case 94:
                        i10 = indexCount;
                        gVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.S));
                        break;
                    case 95:
                        i10 = indexCount;
                        h(gVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i10 = indexCount;
                        h(gVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i10 = indexCount;
                        gVar.b(97, typedArrayObtainStyledAttributes.getInt(index, iVar.f10813o0));
                        break;
                    case 98:
                        i10 = indexCount;
                        int i14 = y.a.D;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            hVar.f10782a = typedArrayObtainStyledAttributes.getResourceId(index, hVar.f10782a);
                        }
                        break;
                    case 99:
                        i10 = indexCount;
                        gVar.d(99, typedArrayObtainStyledAttributes.getBoolean(index, iVar.f10799g));
                        break;
                }
                i11 = i12 + 1;
            }
        } else {
            int i15 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i15 < indexCount2; indexCount2 = i) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i15);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        jVar.getClass();
                        iVar.getClass();
                        lVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        iVar.f10814p = g(typedArrayObtainStyledAttributes, index2, iVar.f10814p);
                        continue;
                        i15++;
                        break;
                    case 2:
                        i = indexCount2;
                        iVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.I);
                        continue;
                        i15++;
                        break;
                    case 3:
                        i = indexCount2;
                        iVar.f10812o = g(typedArrayObtainStyledAttributes, index2, iVar.f10812o);
                        continue;
                        i15++;
                        break;
                    case 4:
                        i = indexCount2;
                        iVar.f10810n = g(typedArrayObtainStyledAttributes, index2, iVar.f10810n);
                        continue;
                        i15++;
                        break;
                    case 5:
                        i = indexCount2;
                        iVar.f10823y = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i15++;
                        break;
                    case 6:
                        i = indexCount2;
                        iVar.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, iVar.C);
                        continue;
                        i15++;
                        break;
                    case 7:
                        i = indexCount2;
                        iVar.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, iVar.D);
                        continue;
                        i15++;
                        break;
                    case 8:
                        i = indexCount2;
                        iVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.J);
                        continue;
                        i15++;
                        break;
                    case 9:
                        i = indexCount2;
                        iVar.f10820v = g(typedArrayObtainStyledAttributes, index2, iVar.f10820v);
                        continue;
                        i15++;
                        break;
                    case 10:
                        i = indexCount2;
                        iVar.f10819u = g(typedArrayObtainStyledAttributes, index2, iVar.f10819u);
                        continue;
                        i15++;
                        break;
                    case 11:
                        i = indexCount2;
                        iVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.P);
                        continue;
                        i15++;
                        break;
                    case 12:
                        i = indexCount2;
                        iVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.Q);
                        continue;
                        i15++;
                        break;
                    case 13:
                        i = indexCount2;
                        iVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.M);
                        continue;
                        i15++;
                        break;
                    case 14:
                        i = indexCount2;
                        iVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.O);
                        continue;
                        i15++;
                        break;
                    case 15:
                        i = indexCount2;
                        iVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.R);
                        continue;
                        i15++;
                        break;
                    case 16:
                        i = indexCount2;
                        iVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.N);
                        continue;
                        i15++;
                        break;
                    case 17:
                        i = indexCount2;
                        iVar.f10794d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, iVar.f10794d);
                        continue;
                        i15++;
                        break;
                    case 18:
                        i = indexCount2;
                        iVar.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, iVar.e);
                        continue;
                        i15++;
                        break;
                    case 19:
                        i = indexCount2;
                        iVar.f10797f = typedArrayObtainStyledAttributes.getFloat(index2, iVar.f10797f);
                        continue;
                        i15++;
                        break;
                    case 20:
                        i = indexCount2;
                        iVar.f10821w = typedArrayObtainStyledAttributes.getFloat(index2, iVar.f10821w);
                        continue;
                        i15++;
                        break;
                    case zzbbs.zzt.zzm /* 21 */:
                        i = indexCount2;
                        iVar.f10792c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, iVar.f10792c);
                        continue;
                        i15++;
                        break;
                    case 22:
                        i = indexCount2;
                        int i16 = typedArrayObtainStyledAttributes.getInt(index2, kVar.f10832a);
                        kVar.f10832a = i16;
                        kVar.f10832a = iArr[i16];
                        continue;
                        i15++;
                        break;
                    case 23:
                        i = indexCount2;
                        iVar.f10790b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, iVar.f10790b);
                        continue;
                        i15++;
                        break;
                    case 24:
                        i = indexCount2;
                        iVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.F);
                        continue;
                        i15++;
                        break;
                    case 25:
                        i = indexCount2;
                        iVar.h = g(typedArrayObtainStyledAttributes, index2, iVar.h);
                        continue;
                        i15++;
                        break;
                    case 26:
                        i = indexCount2;
                        iVar.i = g(typedArrayObtainStyledAttributes, index2, iVar.i);
                        continue;
                        i15++;
                        break;
                    case 27:
                        i = indexCount2;
                        iVar.E = typedArrayObtainStyledAttributes.getInt(index2, iVar.E);
                        continue;
                        i15++;
                        break;
                    case 28:
                        i = indexCount2;
                        iVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.G);
                        continue;
                        i15++;
                        break;
                    case 29:
                        i = indexCount2;
                        iVar.f10803j = g(typedArrayObtainStyledAttributes, index2, iVar.f10803j);
                        continue;
                        i15++;
                        break;
                    case 30:
                        i = indexCount2;
                        iVar.f10805k = g(typedArrayObtainStyledAttributes, index2, iVar.f10805k);
                        continue;
                        i15++;
                        break;
                    case 31:
                        i = indexCount2;
                        iVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.K);
                        continue;
                        i15++;
                        break;
                    case TracingConfig.CATEGORIES_JAVASCRIPT_AND_RENDERING /* 32 */:
                        i = indexCount2;
                        iVar.f10817s = g(typedArrayObtainStyledAttributes, index2, iVar.f10817s);
                        continue;
                        i15++;
                        break;
                    case 33:
                        i = indexCount2;
                        iVar.f10818t = g(typedArrayObtainStyledAttributes, index2, iVar.f10818t);
                        continue;
                        i15++;
                        break;
                    case 34:
                        i = indexCount2;
                        iVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.H);
                        continue;
                        i15++;
                        break;
                    case 35:
                        i = indexCount2;
                        iVar.f10808m = g(typedArrayObtainStyledAttributes, index2, iVar.f10808m);
                        continue;
                        i15++;
                        break;
                    case 36:
                        i = indexCount2;
                        iVar.f10806l = g(typedArrayObtainStyledAttributes, index2, iVar.f10806l);
                        continue;
                        i15++;
                        break;
                    case 37:
                        i = indexCount2;
                        iVar.f10822x = typedArrayObtainStyledAttributes.getFloat(index2, iVar.f10822x);
                        continue;
                        i15++;
                        break;
                    case 38:
                        i = indexCount2;
                        hVar.f10782a = typedArrayObtainStyledAttributes.getResourceId(index2, hVar.f10782a);
                        continue;
                        i15++;
                        break;
                    case 39:
                        i = indexCount2;
                        iVar.U = typedArrayObtainStyledAttributes.getFloat(index2, iVar.U);
                        continue;
                        i15++;
                        break;
                    case 40:
                        i = indexCount2;
                        iVar.T = typedArrayObtainStyledAttributes.getFloat(index2, iVar.T);
                        continue;
                        i15++;
                        break;
                    case 41:
                        i = indexCount2;
                        iVar.V = typedArrayObtainStyledAttributes.getInt(index2, iVar.V);
                        continue;
                        i15++;
                        break;
                    case 42:
                        i = indexCount2;
                        iVar.W = typedArrayObtainStyledAttributes.getInt(index2, iVar.W);
                        continue;
                        i15++;
                        break;
                    case 43:
                        i = indexCount2;
                        kVar.f10834c = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f10834c);
                        continue;
                        i15++;
                        break;
                    case 44:
                        i = indexCount2;
                        lVar.f10845l = true;
                        lVar.f10846m = typedArrayObtainStyledAttributes.getDimension(index2, lVar.f10846m);
                        continue;
                        i15++;
                        break;
                    case 45:
                        i = indexCount2;
                        lVar.f10838b = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f10838b);
                        continue;
                        i15++;
                        break;
                    case 46:
                        i = indexCount2;
                        lVar.f10839c = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f10839c);
                        continue;
                        i15++;
                        break;
                    case 47:
                        i = indexCount2;
                        lVar.f10840d = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f10840d);
                        continue;
                        i15++;
                        break;
                    case 48:
                        i = indexCount2;
                        lVar.e = typedArrayObtainStyledAttributes.getFloat(index2, lVar.e);
                        continue;
                        i15++;
                        break;
                    case 49:
                        i = indexCount2;
                        lVar.f10841f = typedArrayObtainStyledAttributes.getDimension(index2, lVar.f10841f);
                        continue;
                        i15++;
                        break;
                    case 50:
                        i = indexCount2;
                        lVar.f10842g = typedArrayObtainStyledAttributes.getDimension(index2, lVar.f10842g);
                        continue;
                        i15++;
                        break;
                    case 51:
                        i = indexCount2;
                        lVar.i = typedArrayObtainStyledAttributes.getDimension(index2, lVar.i);
                        continue;
                        i15++;
                        break;
                    case 52:
                        i = indexCount2;
                        lVar.f10843j = typedArrayObtainStyledAttributes.getDimension(index2, lVar.f10843j);
                        continue;
                        i15++;
                        break;
                    case 53:
                        i = indexCount2;
                        lVar.f10844k = typedArrayObtainStyledAttributes.getDimension(index2, lVar.f10844k);
                        continue;
                        i15++;
                        break;
                    case 54:
                        i = indexCount2;
                        iVar.X = typedArrayObtainStyledAttributes.getInt(index2, iVar.X);
                        continue;
                        i15++;
                        break;
                    case 55:
                        i = indexCount2;
                        iVar.Y = typedArrayObtainStyledAttributes.getInt(index2, iVar.Y);
                        continue;
                        i15++;
                        break;
                    case 56:
                        i = indexCount2;
                        iVar.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.Z);
                        continue;
                        i15++;
                        break;
                    case 57:
                        i = indexCount2;
                        iVar.f10789a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f10789a0);
                        continue;
                        i15++;
                        break;
                    case 58:
                        i = indexCount2;
                        iVar.f10791b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f10791b0);
                        continue;
                        i15++;
                        break;
                    case 59:
                        i = indexCount2;
                        iVar.f10793c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f10793c0);
                        continue;
                        i15++;
                        break;
                    case 60:
                        i = indexCount2;
                        lVar.f10837a = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f10837a);
                        continue;
                        i15++;
                        break;
                    case 61:
                        i = indexCount2;
                        iVar.f10824z = g(typedArrayObtainStyledAttributes, index2, iVar.f10824z);
                        continue;
                        i15++;
                        break;
                    case 62:
                        i = indexCount2;
                        iVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.A);
                        continue;
                        i15++;
                        break;
                    case 63:
                        i = indexCount2;
                        iVar.B = typedArrayObtainStyledAttributes.getFloat(index2, iVar.B);
                        continue;
                        i15++;
                        break;
                    case TracingConfig.CATEGORIES_FRAME_VIEWER /* 64 */:
                        i = indexCount2;
                        jVar.f10826a = g(typedArrayObtainStyledAttributes, index2, jVar.f10826a);
                        continue;
                        i15++;
                        break;
                    case 65:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            jVar.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            jVar.getClass();
                        }
                        i15++;
                        break;
                    case 66:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        jVar.getClass();
                        continue;
                        i15++;
                        break;
                    case 67:
                        i = indexCount2;
                        jVar.e = typedArrayObtainStyledAttributes.getFloat(index2, jVar.e);
                        break;
                    case 68:
                        i = indexCount2;
                        kVar.f10835d = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f10835d);
                        break;
                    case 69:
                        i = indexCount2;
                        iVar.f10795d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        iVar.f10796e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        iVar.f10798f0 = typedArrayObtainStyledAttributes.getInt(index2, iVar.f10798f0);
                        break;
                    case 73:
                        i = indexCount2;
                        iVar.f10800g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.f10800g0);
                        break;
                    case 74:
                        i = indexCount2;
                        iVar.f10804j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        iVar.f10811n0 = typedArrayObtainStyledAttributes.getBoolean(index2, iVar.f10811n0);
                        break;
                    case 76:
                        i = indexCount2;
                        jVar.f10828c = typedArrayObtainStyledAttributes.getInt(index2, jVar.f10828c);
                        break;
                    case 77:
                        i = indexCount2;
                        iVar.k0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        kVar.f10833b = typedArrayObtainStyledAttributes.getInt(index2, kVar.f10833b);
                        break;
                    case 79:
                        i = indexCount2;
                        jVar.f10829d = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f10829d);
                        break;
                    case 80:
                        i = indexCount2;
                        iVar.f10807l0 = typedArrayObtainStyledAttributes.getBoolean(index2, iVar.f10807l0);
                        break;
                    case 81:
                        i = indexCount2;
                        iVar.f10809m0 = typedArrayObtainStyledAttributes.getBoolean(index2, iVar.f10809m0);
                        break;
                    case 82:
                        i = indexCount2;
                        jVar.f10827b = typedArrayObtainStyledAttributes.getInteger(index2, jVar.f10827b);
                        break;
                    case 83:
                        i = indexCount2;
                        lVar.h = g(typedArrayObtainStyledAttributes, index2, lVar.h);
                        break;
                    case 84:
                        i = indexCount2;
                        jVar.f10831g = typedArrayObtainStyledAttributes.getInteger(index2, jVar.f10831g);
                        break;
                    case 85:
                        i = indexCount2;
                        jVar.f10830f = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f10830f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i17 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i17 == 1) {
                            jVar.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i17 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            jVar.h = string2;
                            if (string2.indexOf("/") > 0) {
                                jVar.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, jVar.i);
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb3 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb3.append(Integer.toHexString(index2));
                        sb3.append("   ");
                        sb3.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb3.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        iVar.f10815q = g(typedArrayObtainStyledAttributes, index2, iVar.f10815q);
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 92 */:
                        i = indexCount2;
                        iVar.f10816r = g(typedArrayObtainStyledAttributes, index2, iVar.f10816r);
                        break;
                    case 93:
                        i = indexCount2;
                        iVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.L);
                        break;
                    case 94:
                        i = indexCount2;
                        iVar.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, iVar.S);
                        break;
                    case 95:
                        i = indexCount2;
                        h(iVar, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i15++;
                        break;
                    case 96:
                        i = indexCount2;
                        h(iVar, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        iVar.f10813o0 = typedArrayObtainStyledAttributes.getInt(index2, iVar.f10813o0);
                        break;
                }
                i15++;
            }
            if (iVar.f10804j0 != null) {
                iVar.f10802i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return hVar;
    }

    public static int g(TypedArray typedArray, int i, int i10) {
        int resourceId = typedArray.getResourceId(i, i10);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    public static void h(Object obj, TypedArray typedArray, int i, int i10) {
        int dimensionPixelSize;
        g gVar;
        i iVar;
        d dVar;
        if (obj == null) {
            return;
        }
        int i11 = typedArray.peekValue(i).type;
        boolean z4 = true;
        int i12 = 0;
        if (i11 != 3) {
            if (i11 != 5) {
                dimensionPixelSize = typedArray.getInt(i, 0);
                if (dimensionPixelSize == -4) {
                    i12 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z4 = false;
                }
                if (obj instanceof d) {
                    dVar = (d) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) dVar).width = i12;
                        dVar.W = z4;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) dVar).height = i12;
                        dVar.X = z4;
                        return;
                    }
                }
                if (obj instanceof i) {
                    iVar = (i) obj;
                    if (i10 == 0) {
                        iVar.f10790b = i12;
                        iVar.f10807l0 = z4;
                        return;
                    } else {
                        iVar.f10792c = i12;
                        iVar.f10809m0 = z4;
                        return;
                    }
                }
                if (obj instanceof g) {
                    gVar = (g) obj;
                    if (i10 == 0) {
                        gVar.b(23, i12);
                        gVar.d(80, z4);
                        return;
                    } else {
                        gVar.b(21, i12);
                        gVar.d(81, z4);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            z4 = false;
            i12 = dimensionPixelSize;
            if (obj instanceof d) {
                dVar = (d) obj;
                if (i10 == 0) {
                    ((ViewGroup.MarginLayoutParams) dVar).width = i12;
                    dVar.W = z4;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) dVar).height = i12;
                    dVar.X = z4;
                    return;
                }
            }
            if (obj instanceof i) {
                iVar = (i) obj;
                if (i10 == 0) {
                    iVar.f10790b = i12;
                    iVar.f10807l0 = z4;
                    return;
                } else {
                    iVar.f10792c = i12;
                    iVar.f10809m0 = z4;
                    return;
                }
            }
            if (obj instanceof g) {
                gVar = (g) obj;
                if (i10 == 0) {
                    gVar.b(23, i12);
                    gVar.d(80, z4);
                    return;
                } else {
                    gVar.b(21, i12);
                    gVar.d(81, z4);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof d) {
                    d dVar2 = (d) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) dVar2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) dVar2).height = 0;
                    }
                    i(dVar2, strTrim2);
                    return;
                }
                if (obj instanceof i) {
                    ((i) obj).f10823y = strTrim2;
                    return;
                } else {
                    if (obj instanceof g) {
                        ((g) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f10 = Float.parseFloat(strTrim2);
                    if (obj instanceof d) {
                        d dVar3 = (d) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) dVar3).width = 0;
                            dVar3.H = f10;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) dVar3).height = 0;
                            dVar3.I = f10;
                            return;
                        }
                    }
                    if (obj instanceof i) {
                        i iVar2 = (i) obj;
                        if (i10 == 0) {
                            iVar2.f10790b = 0;
                            iVar2.U = f10;
                            return;
                        } else {
                            iVar2.f10792c = 0;
                            iVar2.T = f10;
                            return;
                        }
                    }
                    if (obj instanceof g) {
                        g gVar2 = (g) obj;
                        if (i10 == 0) {
                            gVar2.b(23, 0);
                            gVar2.a(39, f10);
                            return;
                        } else {
                            gVar2.b(21, 0);
                            gVar2.a(40, f10);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof d) {
                        d dVar4 = (d) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) dVar4).width = 0;
                            dVar4.R = fMax;
                            dVar4.L = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) dVar4).height = 0;
                            dVar4.S = fMax;
                            dVar4.M = 2;
                            return;
                        }
                    }
                    if (obj instanceof i) {
                        i iVar3 = (i) obj;
                        if (i10 == 0) {
                            iVar3.f10790b = 0;
                            iVar3.f10795d0 = fMax;
                            iVar3.X = 2;
                            return;
                        } else {
                            iVar3.f10792c = 0;
                            iVar3.f10796e0 = fMax;
                            iVar3.Y = 2;
                            return;
                        }
                    }
                    if (obj instanceof g) {
                        g gVar3 = (g) obj;
                        if (i10 == 0) {
                            gVar3.b(23, 0);
                            gVar3.b(54, 2);
                        } else {
                            gVar3.b(21, 0);
                            gVar3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void i(d dVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = 0;
            int i10 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i10 = i;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > 0.0f && f11 > 0.0f) {
                            if (i10 == 1) {
                                Math.abs(f11 / f10);
                            } else {
                                Math.abs(f10 / f11);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        dVar.G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        HashMap map;
        String resourceEntryName;
        m mVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = mVar.f10851c;
        HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id2))) {
                StringBuilder sb2 = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb2.append(resourceEntryName);
                Log.w("ConstraintSet", sb2.toString());
            } else {
                if (mVar.f10850b && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (map2.containsKey(Integer.valueOf(id2))) {
                        hashSet2.remove(Integer.valueOf(id2));
                        h hVar = (h) map2.get(Integer.valueOf(id2));
                        if (hVar != null) {
                            k kVar = hVar.f10783b;
                            i iVar = hVar.f10785d;
                            l lVar = hVar.e;
                            if (childAt instanceof Barrier) {
                                iVar.f10801h0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(iVar.f10798f0);
                                barrier.setMargin(iVar.f10800g0);
                                barrier.setAllowsGoneWidget(iVar.f10811n0);
                                int[] iArr = iVar.f10802i0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = iVar.f10804j0;
                                    if (str != null) {
                                        int[] iArrC = c(barrier, str);
                                        iVar.f10802i0 = iArrC;
                                        barrier.setReferencedIds(iArrC);
                                    }
                                }
                            }
                            d dVar = (d) childAt.getLayoutParams();
                            dVar.a();
                            hVar.a(dVar);
                            HashMap map3 = hVar.f10786f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map3.keySet()) {
                                a aVar = (a) map3.get(str2);
                                HashSet hashSet3 = hashSet2;
                                String strB = !aVar.f10712a ? u3.b.b("set", str2) : str2;
                                int i11 = i10;
                                try {
                                    int iD = u.e.d(aVar.f10713b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (iD) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(strB, cls3).invoke(childAt, Integer.valueOf(aVar.f10714c));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(strB, cls2).invoke(childAt, Float.valueOf(aVar.f10715d));
                                            break;
                                        case 2:
                                            map = map3;
                                            cls.getMethod(strB, cls3).invoke(childAt, Integer.valueOf(aVar.f10717g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(strB, Drawable.class);
                                            map = map3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(aVar.f10717g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e4) {
                                                e = e4;
                                                StringBuilder sbN = q1.a.n(" Custom Attribute \"", str2, "\" not found on ");
                                                sbN.append(cls.getName());
                                                Log.e("TransitionLayout", sbN.toString());
                                                e.printStackTrace();
                                            } catch (NoSuchMethodException e10) {
                                                e = e10;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strB);
                                            } catch (InvocationTargetException e11) {
                                                e = e11;
                                                StringBuilder sbN2 = q1.a.n(" Custom Attribute \"", str2, "\" not found on ");
                                                sbN2.append(cls.getName());
                                                Log.e("TransitionLayout", sbN2.toString());
                                                e.printStackTrace();
                                            }
                                            break;
                                        case 4:
                                            cls.getMethod(strB, CharSequence.class).invoke(childAt, aVar.e);
                                            map = map3;
                                            break;
                                        case 5:
                                            cls.getMethod(strB, Boolean.TYPE).invoke(childAt, Boolean.valueOf(aVar.f10716f));
                                            map = map3;
                                            break;
                                        case 6:
                                            cls.getMethod(strB, cls2).invoke(childAt, Float.valueOf(aVar.f10715d));
                                            map = map3;
                                            break;
                                        case 7:
                                            cls.getMethod(strB, cls3).invoke(childAt, Integer.valueOf(aVar.f10714c));
                                            map = map3;
                                            break;
                                        default:
                                            map = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e12) {
                                    e = e12;
                                    map = map3;
                                } catch (NoSuchMethodException e13) {
                                    e = e13;
                                    map = map3;
                                } catch (InvocationTargetException e14) {
                                    e = e14;
                                    map = map3;
                                }
                                hashSet2 = hashSet3;
                                i10 = i11;
                                map3 = map;
                            }
                            hashSet = hashSet2;
                            i = i10;
                            childAt.setLayoutParams(dVar);
                            if (kVar.f10833b == 0) {
                                childAt.setVisibility(kVar.f10832a);
                            }
                            childAt.setAlpha(kVar.f10834c);
                            childAt.setRotation(lVar.f10837a);
                            childAt.setRotationX(lVar.f10838b);
                            childAt.setRotationY(lVar.f10839c);
                            childAt.setScaleX(lVar.f10840d);
                            childAt.setScaleY(lVar.e);
                            if (lVar.h != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(lVar.h);
                                if (viewFindViewById != null) {
                                    float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                    float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left = right - childAt.getLeft();
                                        float top = bottom - childAt.getTop();
                                        childAt.setPivotX(left);
                                        childAt.setPivotY(top);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(lVar.f10841f)) {
                                    childAt.setPivotX(lVar.f10841f);
                                }
                                if (!Float.isNaN(lVar.f10842g)) {
                                    childAt.setPivotY(lVar.f10842g);
                                }
                            }
                            childAt.setTranslationX(lVar.i);
                            childAt.setTranslationY(lVar.f10843j);
                            childAt.setTranslationZ(lVar.f10844k);
                            if (lVar.f10845l) {
                                childAt.setElevation(lVar.f10846m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i10;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
                i10 = i + 1;
                mVar = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i = i10;
            i10 = i + 1;
            mVar = this;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            h hVar2 = (h) map2.get(num);
            if (hVar2 != null) {
                i iVar2 = hVar2.f10785d;
                if (iVar2.f10801h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = iVar2.f10802i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str3 = iVar2.f10804j0;
                        if (str3 != null) {
                            int[] iArrC2 = c(barrier2, str3);
                            iVar2.f10802i0 = iArrC2;
                            barrier2.setReferencedIds(iArrC2);
                        }
                    }
                    barrier2.setType(iVar2.f10798f0);
                    barrier2.setMargin(iVar2.f10800g0);
                    d dVarG = ConstraintLayout.g();
                    barrier2.i();
                    hVar2.a(dVarG);
                    constraintLayout.addView(barrier2, dVarG);
                }
                if (iVar2.f10788a) {
                    View oVar = new o(constraintLayout.getContext());
                    oVar.setId(num.intValue());
                    d dVarG2 = ConstraintLayout.g();
                    hVar2.a(dVarG2);
                    constraintLayout.addView(oVar, dVarG2);
                }
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = constraintLayout.getChildAt(i12);
            if (childAt2 instanceof b) {
                ((b) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        HashMap map2;
        m mVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = mVar.f10851c;
        map3.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            d dVar = (d) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (mVar.f10850b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map3.containsKey(Integer.valueOf(id2))) {
                map3.put(Integer.valueOf(id2), new h());
            }
            h hVar = (h) map3.get(Integer.valueOf(id2));
            if (hVar == null) {
                i = childCount;
                map = map3;
            } else {
                k kVar = hVar.f10783b;
                i iVar = hVar.f10785d;
                l lVar = hVar.e;
                HashMap map4 = new HashMap();
                Class<?> cls = childAt.getClass();
                HashMap map5 = mVar.f10849a;
                for (String str : map5.keySet()) {
                    a aVar = (a) map5.get(str);
                    int i11 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map4.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e4) {
                                e = e4;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e10) {
                                e = e10;
                                e.printStackTrace();
                            } catch (InvocationTargetException e11) {
                                e = e11;
                                e.printStackTrace();
                            }
                        } else {
                            map2 = map3;
                            map4.put(str, new a(aVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e12) {
                        e = e12;
                        map2 = map3;
                    } catch (NoSuchMethodException e13) {
                        e = e13;
                        map2 = map3;
                    } catch (InvocationTargetException e14) {
                        e = e14;
                        map2 = map3;
                    }
                    childCount = i11;
                    map3 = map2;
                }
                i = childCount;
                map = map3;
                hVar.f10786f = map4;
                hVar.f10782a = id2;
                iVar.h = dVar.e;
                iVar.i = dVar.f10734f;
                iVar.f10803j = dVar.f10736g;
                iVar.f10805k = dVar.h;
                iVar.f10806l = dVar.i;
                iVar.f10808m = dVar.f10740j;
                iVar.f10810n = dVar.f10742k;
                iVar.f10812o = dVar.f10743l;
                iVar.f10814p = dVar.f10745m;
                iVar.f10815q = dVar.f10747n;
                iVar.f10816r = dVar.f10749o;
                iVar.f10817s = dVar.f10755s;
                iVar.f10818t = dVar.f10756t;
                iVar.f10819u = dVar.f10757u;
                iVar.f10820v = dVar.f10758v;
                iVar.f10821w = dVar.E;
                iVar.f10822x = dVar.F;
                iVar.f10823y = dVar.G;
                iVar.f10824z = dVar.f10751p;
                iVar.A = dVar.f10753q;
                iVar.B = dVar.f10754r;
                iVar.C = dVar.T;
                iVar.D = dVar.U;
                iVar.E = dVar.V;
                iVar.f10797f = dVar.f10729c;
                iVar.f10794d = dVar.f10725a;
                iVar.e = dVar.f10727b;
                iVar.f10790b = ((ViewGroup.MarginLayoutParams) dVar).width;
                iVar.f10792c = ((ViewGroup.MarginLayoutParams) dVar).height;
                iVar.F = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                iVar.G = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
                iVar.H = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                iVar.I = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
                iVar.L = dVar.D;
                iVar.T = dVar.I;
                iVar.U = dVar.H;
                iVar.W = dVar.K;
                iVar.V = dVar.J;
                iVar.f10807l0 = dVar.W;
                iVar.f10809m0 = dVar.X;
                iVar.X = dVar.L;
                iVar.Y = dVar.M;
                iVar.Z = dVar.P;
                iVar.f10789a0 = dVar.Q;
                iVar.f10791b0 = dVar.N;
                iVar.f10793c0 = dVar.O;
                iVar.f10795d0 = dVar.R;
                iVar.f10796e0 = dVar.S;
                iVar.k0 = dVar.Y;
                iVar.N = dVar.f10760x;
                iVar.P = dVar.f10762z;
                iVar.M = dVar.f10759w;
                iVar.O = dVar.f10761y;
                iVar.R = dVar.A;
                iVar.Q = dVar.B;
                iVar.S = dVar.C;
                iVar.f10813o0 = dVar.Z;
                iVar.J = dVar.getMarginEnd();
                iVar.K = dVar.getMarginStart();
                kVar.f10832a = childAt.getVisibility();
                kVar.f10834c = childAt.getAlpha();
                lVar.f10837a = childAt.getRotation();
                lVar.f10838b = childAt.getRotationX();
                lVar.f10839c = childAt.getRotationY();
                lVar.f10840d = childAt.getScaleX();
                lVar.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    lVar.f10841f = pivotX;
                    lVar.f10842g = pivotY;
                }
                lVar.i = childAt.getTranslationX();
                lVar.f10843j = childAt.getTranslationY();
                lVar.f10844k = childAt.getTranslationZ();
                if (lVar.f10845l) {
                    lVar.f10846m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    iVar.f10811n0 = barrier.getAllowsGoneWidget();
                    iVar.f10802i0 = barrier.getReferencedIds();
                    iVar.f10798f0 = barrier.getType();
                    iVar.f10800g0 = barrier.getMargin();
                }
            }
            i10++;
            mVar = this;
            childCount = i;
            map3 = map;
        }
    }

    public final h e(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f10851c;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), new h());
        }
        return (h) map.get(Integer.valueOf(i));
    }

    public final void f(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    h hVarD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        hVarD.f10785d.f10788a = true;
                    }
                    this.f10851c.put(Integer.valueOf(hVarD.f10782a), hVarD);
                }
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        }
    }
}
