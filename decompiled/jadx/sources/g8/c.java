package g8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import app.namso_gen.spacehowen.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import u8.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f4310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4311b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4313d;
    public final float e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f4314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f4315g;
    public final float h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f4316j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f4317k;

    public c(Context context) {
        AttributeSet attributeSet;
        int styleAttribute;
        int next;
        b bVar = new b();
        int i = bVar.f4296a;
        if (i != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                attributeSet = attributeSetAsAttributeSet;
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayG = n.g(context, attributeSet, d8.a.f3012a, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f4312c = typedArrayG.getDimensionPixelSize(4, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f4316j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f4313d = typedArrayG.getDimensionPixelSize(14, -1);
        this.e = typedArrayG.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.f4315g = typedArrayG.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f4314f = typedArrayG.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.h = typedArrayG.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f4317k = typedArrayG.getInt(24, 1);
        b bVar2 = this.f4311b;
        int i10 = bVar.f4303t;
        bVar2.f4303t = i10 == -2 ? 255 : i10;
        int i11 = bVar.f4305v;
        if (i11 != -2) {
            bVar2.f4305v = i11;
        } else if (typedArrayG.hasValue(23)) {
            this.f4311b.f4305v = typedArrayG.getInt(23, 0);
        } else {
            this.f4311b.f4305v = -1;
        }
        String str = bVar.f4304u;
        if (str != null) {
            this.f4311b.f4304u = str;
        } else if (typedArrayG.hasValue(7)) {
            this.f4311b.f4304u = typedArrayG.getString(7);
        }
        b bVar3 = this.f4311b;
        bVar3.f4309z = bVar.f4309z;
        CharSequence charSequence = bVar.A;
        bVar3.A = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        b bVar4 = this.f4311b;
        int i12 = bVar.B;
        bVar4.B = i12 == 0 ? R.plurals.mtrl_badge_content_description : i12;
        int i13 = bVar.C;
        bVar4.C = i13 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i13;
        Boolean bool = bVar.E;
        bVar4.E = Boolean.valueOf(bool == null || bool.booleanValue());
        b bVar5 = this.f4311b;
        int i14 = bVar.f4306w;
        bVar5.f4306w = i14 == -2 ? typedArrayG.getInt(21, -2) : i14;
        b bVar6 = this.f4311b;
        int i15 = bVar.f4307x;
        bVar6.f4307x = i15 == -2 ? typedArrayG.getInt(22, -2) : i15;
        b bVar7 = this.f4311b;
        Integer num = bVar.e;
        bVar7.e = Integer.valueOf(num == null ? typedArrayG.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        b bVar8 = this.f4311b;
        Integer num2 = bVar.f4300f;
        bVar8.f4300f = Integer.valueOf(num2 == null ? typedArrayG.getResourceId(6, 0) : num2.intValue());
        b bVar9 = this.f4311b;
        Integer num3 = bVar.f4301r;
        bVar9.f4301r = Integer.valueOf(num3 == null ? typedArrayG.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        b bVar10 = this.f4311b;
        Integer num4 = bVar.f4302s;
        bVar10.f4302s = Integer.valueOf(num4 == null ? typedArrayG.getResourceId(16, 0) : num4.intValue());
        b bVar11 = this.f4311b;
        Integer num5 = bVar.f4297b;
        bVar11.f4297b = Integer.valueOf(num5 == null ? android.support.v4.media.session.a.h(context, typedArrayG, 1).getDefaultColor() : num5.intValue());
        b bVar12 = this.f4311b;
        Integer num6 = bVar.f4299d;
        bVar12.f4299d = Integer.valueOf(num6 == null ? typedArrayG.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = bVar.f4298c;
        if (num7 != null) {
            this.f4311b.f4298c = num7;
        } else if (typedArrayG.hasValue(9)) {
            this.f4311b.f4298c = Integer.valueOf(android.support.v4.media.session.a.h(context, typedArrayG, 9).getDefaultColor());
        } else {
            int iIntValue = this.f4311b.f4299d.intValue();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, d8.a.I);
            typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList colorStateListH = android.support.v4.media.session.a.h(context, typedArrayObtainStyledAttributes, 3);
            android.support.v4.media.session.a.h(context, typedArrayObtainStyledAttributes, 4);
            android.support.v4.media.session.a.h(context, typedArrayObtainStyledAttributes, 5);
            typedArrayObtainStyledAttributes.getInt(2, 0);
            typedArrayObtainStyledAttributes.getInt(1, 1);
            int i16 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
            typedArrayObtainStyledAttributes.getResourceId(i16, 0);
            typedArrayObtainStyledAttributes.getString(i16);
            typedArrayObtainStyledAttributes.getBoolean(14, false);
            android.support.v4.media.session.a.h(context, typedArrayObtainStyledAttributes, 6);
            typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, d8.a.f3033y);
            typedArrayObtainStyledAttributes2.hasValue(0);
            typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f4311b.f4298c = Integer.valueOf(colorStateListH.getDefaultColor());
        }
        b bVar13 = this.f4311b;
        Integer num8 = bVar.D;
        bVar13.D = Integer.valueOf(num8 == null ? typedArrayG.getInt(2, 8388661) : num8.intValue());
        b bVar14 = this.f4311b;
        Integer num9 = bVar.F;
        bVar14.F = Integer.valueOf(num9 == null ? typedArrayG.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        b bVar15 = this.f4311b;
        Integer num10 = bVar.G;
        bVar15.G = Integer.valueOf(num10 == null ? typedArrayG.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        b bVar16 = this.f4311b;
        Integer num11 = bVar.H;
        bVar16.H = Integer.valueOf(num11 == null ? typedArrayG.getDimensionPixelOffset(18, 0) : num11.intValue());
        b bVar17 = this.f4311b;
        Integer num12 = bVar.I;
        bVar17.I = Integer.valueOf(num12 == null ? typedArrayG.getDimensionPixelOffset(25, 0) : num12.intValue());
        b bVar18 = this.f4311b;
        Integer num13 = bVar.J;
        bVar18.J = Integer.valueOf(num13 == null ? typedArrayG.getDimensionPixelOffset(19, bVar18.H.intValue()) : num13.intValue());
        b bVar19 = this.f4311b;
        Integer num14 = bVar.K;
        bVar19.K = Integer.valueOf(num14 == null ? typedArrayG.getDimensionPixelOffset(26, bVar19.I.intValue()) : num14.intValue());
        b bVar20 = this.f4311b;
        Integer num15 = bVar.N;
        bVar20.N = Integer.valueOf(num15 == null ? typedArrayG.getDimensionPixelOffset(20, 0) : num15.intValue());
        b bVar21 = this.f4311b;
        Integer num16 = bVar.L;
        bVar21.L = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        b bVar22 = this.f4311b;
        Integer num17 = bVar.M;
        bVar22.M = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        b bVar23 = this.f4311b;
        Boolean bool2 = bVar.O;
        bVar23.O = Boolean.valueOf(bool2 == null ? typedArrayG.getBoolean(0, false) : bool2.booleanValue());
        typedArrayG.recycle();
        Locale locale = bVar.f4308y;
        if (locale == null) {
            this.f4311b.f4308y = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f4311b.f4308y = locale;
        }
        this.f4310a = bVar;
    }
}
