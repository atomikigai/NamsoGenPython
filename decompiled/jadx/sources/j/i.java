package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import k.o;
import l.l1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends MenuInflater {
    public static final Class[] e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f5621f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f5622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f5623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f5624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5625d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f5621f = clsArr;
    }

    public i(Context context) {
        super(context);
        this.f5624c = context;
        Object[] objArr = {context};
        this.f5622a = objArr;
        this.f5623b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        h hVar = new h(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z4 = false;
        boolean z10 = false;
        String str = null;
        while (!z4) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == i) {
                if (!z10) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.f5624c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f3564p);
                        hVar.f5599b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        hVar.f5600c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        hVar.f5601d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        hVar.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        hVar.f5602f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        hVar.f5603g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        a2.l lVarF = a2.l.F(context, attributeSet, f.a.f3565q);
                        TypedArray typedArray = (TypedArray) lVarF.f44c;
                        hVar.i = typedArray.getResourceId(2, 0);
                        hVar.f5604j = (typedArray.getInt(5, hVar.f5600c) & (-65536)) | (typedArray.getInt(6, hVar.f5601d) & 65535);
                        hVar.f5605k = typedArray.getText(7);
                        hVar.f5606l = typedArray.getText(8);
                        hVar.f5607m = typedArray.getResourceId(0, 0);
                        String string = typedArray.getString(9);
                        hVar.f5608n = string == null ? (char) 0 : string.charAt(0);
                        hVar.f5609o = typedArray.getInt(16, 4096);
                        String string2 = typedArray.getString(10);
                        hVar.f5610p = string2 == null ? (char) 0 : string2.charAt(0);
                        hVar.f5611q = typedArray.getInt(20, 4096);
                        if (typedArray.hasValue(11)) {
                            hVar.f5612r = typedArray.getBoolean(11, false) ? 1 : 0;
                        } else {
                            hVar.f5612r = hVar.e;
                        }
                        hVar.f5613s = typedArray.getBoolean(3, false);
                        hVar.f5614t = typedArray.getBoolean(4, hVar.f5602f);
                        hVar.f5615u = typedArray.getBoolean(1, hVar.f5603g);
                        hVar.f5616v = typedArray.getInt(21, -1);
                        hVar.f5619y = typedArray.getString(12);
                        hVar.f5617w = typedArray.getResourceId(13, 0);
                        hVar.f5618x = typedArray.getString(15);
                        String string3 = typedArray.getString(14);
                        boolean z11 = string3 != null;
                        if (z11 && hVar.f5617w == 0 && hVar.f5618x == null) {
                            hVar.f5620z = (o) hVar.a(string3, f5621f, this.f5623b);
                        } else {
                            if (z11) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            hVar.f5620z = null;
                        }
                        hVar.A = typedArray.getText(17);
                        hVar.B = typedArray.getText(22);
                        if (typedArray.hasValue(19)) {
                            hVar.D = l1.b(typedArray.getInt(19, -1), hVar.D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            hVar.D = null;
                        }
                        if (typedArray.hasValue(18)) {
                            hVar.C = lVarF.t(18);
                        } else {
                            hVar.C = colorStateList;
                        }
                        lVarF.I();
                        hVar.h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        hVar.h = true;
                        SubMenu subMenuAddSubMenu = hVar.f5598a.addSubMenu(hVar.f5599b, hVar.i, hVar.f5604j, hVar.f5605k);
                        hVar.b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z10 = true;
                    }
                }
                z4 = z4;
            } else if (eventType != 3) {
                z4 = z4;
            } else {
                String name3 = xmlPullParser.getName();
                if (z10 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z10 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        hVar.f5599b = 0;
                        hVar.f5600c = 0;
                        hVar.f5601d = 0;
                        hVar.e = 0;
                        hVar.f5602f = true;
                        hVar.f5603g = true;
                    } else if (name3.equals("item")) {
                        if (!hVar.h) {
                            o oVar = hVar.f5620z;
                            if (oVar == null || !oVar.f5892a.hasSubMenu()) {
                                hVar.h = true;
                                hVar.b(hVar.f5598a.add(hVar.f5599b, hVar.i, hVar.f5604j, hVar.f5605k));
                            } else {
                                hVar.h = true;
                                hVar.b(hVar.f5598a.addSubMenu(hVar.f5599b, hVar.i, hVar.f5604j, hVar.f5605k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z4 = true;
                    }
                    z4 = z4;
                }
            }
            eventType = xmlPullParser.next();
            i = 2;
            z4 = z4;
            z10 = z10;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof k.l)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f5624c.getResources().getLayout(i);
                    b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (IOException e4) {
                    throw new InflateException("Error inflating menu XML", e4);
                }
            } catch (XmlPullParserException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
