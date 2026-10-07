package bb;

import a2.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.widget.ImageView;
import bd.h;
import bd.q;
import bd.t;
import java.io.IOException;
import java.util.ArrayList;
import jc.i;
import l.l1;
import l.r;
import o6.h0;
import org.xmlpull.v1.XmlPullParserException;
import q0.v0;
import u0.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1526d;

    public /* synthetic */ b() {
        this.f1523a = 0;
    }

    public static b c(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        int i10;
        float f10;
        float f11;
        int i11;
        Shader.TileMode tileMode;
        Object radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            i10 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = g0.c.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new b(obj, colorStateListB, colorStateListB.getDefaultColor(), i10);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayF = g0.b.f(resources, theme, attributeSetAsAttributeSet, c0.a.f1717d);
        float f12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayF.getFloat(8, 0.0f) : 0.0f;
        float f13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayF.getFloat(9, 0.0f) : 0.0f;
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayF.getFloat(10, 0.0f) : 0.0f;
        float f15 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayF.getFloat(11, 0.0f) : 0.0f;
        float f16 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayF.getFloat(3, 0.0f) : 0.0f;
        float f17 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayF.getFloat(4, 0.0f) : 0.0f;
        int i12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayF.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayF.getColor(0, 0) : 0;
        boolean z4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayF.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayF.getColor(1, 0) : 0;
        int i13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayF.getInt(6, 0) : 0;
        float f18 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayF.getFloat(5, 0.0f) : 0.0f;
        typedArrayF.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f19 = f18;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f10 = f14;
            if (next2 == 1) {
                f11 = f15;
                break;
            }
            int depth2 = xml.getDepth();
            f11 = f15;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayF2 = g0.b.f(resources, theme, attributeSetAsAttributeSet, c0.a.e);
                boolean zHasValue = typedArrayF2.hasValue(0);
                boolean zHasValue2 = typedArrayF2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayF2.getColor(0, 0);
                float f20 = typedArrayF2.getFloat(1, 0.0f);
                typedArrayF2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f20));
            }
            f14 = f10;
            f15 = f11;
        }
        aa.c cVar = arrayList2.size() > 0 ? new aa.c(arrayList2, arrayList) : null;
        if (cVar == null) {
            cVar = z4 ? new aa.c(color, color2, color3) : new aa.c(color, color3);
        }
        if (i12 != 1) {
            if (i12 != 2) {
                int[] iArr = (int[]) cVar.f263b;
                float[] fArr = (float[]) cVar.f264c;
                if (i13 != 1) {
                    tileMode2 = i13 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f12, f13, f10, f11, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f16, f17, (int[]) cVar.f263b, (float[]) cVar.f264c);
            }
            i11 = 2;
        } else {
            if (f19 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = (int[]) cVar.f263b;
            float[] fArr2 = (float[]) cVar.f264c;
            if (i13 != 1) {
                i11 = 2;
                tileMode = i13 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                i11 = 2;
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f16, f17, f19, iArr2, fArr2, tileMode);
        }
        return new b(radialGradient, null, 0, i11);
    }

    public void a() {
        h hVar;
        ImageView imageView = (ImageView) this.f1525c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            l1.a(drawable);
        }
        if (drawable == null || (hVar = (h) this.f1526d) == null) {
            return;
        }
        r.e(drawable, hVar, imageView.getDrawableState());
    }

    public c b() {
        if ("".isEmpty()) {
            return new c((String) this.f1525c, ((Long) this.f1526d).longValue(), this.f1524b);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    public boolean d() {
        ColorStateList colorStateList;
        return ((Shader) this.f1525c) == null && (colorStateList = (ColorStateList) this.f1526d) != null && colorStateList.isStateful();
    }

    public void e(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f1525c;
        Context context = imageView.getContext();
        int[] iArr = f.a.f3556f;
        l lVarG = l.G(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) lVarG.f44c;
        v0.k(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) lVarG.f44c, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = com.bumptech.glide.d.r(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                l1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                f.c(imageView, lVarG.t(2));
            }
            if (typedArray.hasValue(3)) {
                f.d(imageView, l1.b(typedArray.getInt(3, -1), null));
            }
        } finally {
            lVarG.I();
        }
    }

    public void f(int i) {
        ImageView imageView = (ImageView) this.f1525c;
        if (i != 0) {
            Drawable drawableR = com.bumptech.glide.d.r(imageView.getContext(), i);
            if (drawableR != null) {
                l1.a(drawableR);
            }
            imageView.setImageDrawable(drawableR);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }

    public String toString() {
        switch (this.f1523a) {
            case 3:
                StringBuilder sb2 = new StringBuilder();
                if (((t) this.f1526d) == t.HTTP_1_0) {
                    sb2.append("HTTP/1.0");
                } else {
                    sb2.append("HTTP/1.1");
                }
                sb2.append(' ');
                sb2.append(this.f1524b);
                sb2.append(' ');
                sb2.append((String) this.f1525c);
                String string = sb2.toString();
                i.d(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, int i, int i10) {
        this.f1523a = i10;
        this.f1525c = obj;
        this.f1526d = obj2;
        this.f1524b = i;
    }

    public b(t tVar, int i, String str) {
        this.f1523a = 3;
        this.f1526d = tVar;
        this.f1524b = i;
        this.f1525c = str;
    }

    public b(q qVar, int i, byte[] bArr) {
        this.f1523a = 1;
        this.f1525c = qVar;
        this.f1524b = i;
        this.f1526d = bArr;
    }

    public b(ImageView imageView) {
        this.f1523a = 4;
        this.f1524b = 0;
        this.f1525c = imageView;
    }

    public b(g7.i iVar) {
        this.f1523a = 6;
        this.f1526d = q4.d.a(150, new h0(this));
        this.f1525c = iVar;
    }
}
