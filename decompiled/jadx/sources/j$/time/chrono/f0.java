package j$.time.chrono;

import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f5384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5385b;

    public f0() {
    }

    public f0(byte b10, Object obj) {
        this.f5384a = b10;
        this.f5385b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f5384a;
        Object obj = this.f5385b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                objectOutput.writeUTF(((a) obj).o());
                return;
            case 2:
                g gVar = (g) obj;
                objectOutput.writeObject(gVar.f5386a);
                objectOutput.writeObject(gVar.f5387b);
                return;
            case 3:
                l lVar = (l) obj;
                objectOutput.writeObject(lVar.f5399a);
                objectOutput.writeObject(lVar.f5400b);
                objectOutput.writeObject(lVar.f5401c);
                return;
            case 4:
                y yVar = (y) obj;
                yVar.getClass();
                objectOutput.writeInt(yVar.e(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(yVar.e(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(yVar.e(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((z) obj).f5426a);
                return;
            case 6:
                r rVar = (r) obj;
                objectOutput.writeObject(rVar.f5411a);
                objectOutput.writeInt(rVar.e(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(rVar.e(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(rVar.e(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 7:
                d0 d0Var = (d0) obj;
                d0Var.getClass();
                objectOutput.writeInt(d0Var.e(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(d0Var.e(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(d0Var.e(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                j0 j0Var = (j0) obj;
                j0Var.getClass();
                objectOutput.writeInt(j0Var.e(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j0Var.e(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j0Var.e(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                h hVar = (h) obj;
                objectOutput.writeUTF(hVar.f5389a.o());
                objectOutput.writeInt(hVar.f5390b);
                objectOutput.writeInt(hVar.f5391c);
                objectOutput.writeInt(hVar.f5392d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objOf;
        byte b10 = objectInput.readByte();
        this.f5384a = b10;
        switch (b10) {
            case 1:
                ConcurrentHashMap concurrentHashMap = a.f5375a;
                objOf = m.of(objectInput.readUTF());
                break;
            case 2:
                objOf = ((b) objectInput.readObject()).F((j$.time.i) objectInput.readObject());
                break;
            case 3:
                objOf = ((e) objectInput.readObject()).r((ZoneOffset) objectInput.readObject()).y((j$.time.v) objectInput.readObject());
                break;
            case 4:
                j$.time.f fVar = y.f5421d;
                int i = objectInput.readInt();
                byte b11 = objectInput.readByte();
                byte b12 = objectInput.readByte();
                w.f5419c.getClass();
                objOf = new y(j$.time.f.P(i, b11, b12));
                break;
            case 5:
                z zVar = z.f5425d;
                objOf = z.s(objectInput.readByte());
                break;
            case 6:
                p pVar = (p) objectInput.readObject();
                int i10 = objectInput.readInt();
                byte b13 = objectInput.readByte();
                byte b14 = objectInput.readByte();
                pVar.getClass();
                objOf = new r(pVar, i10, b13, b14);
                break;
            case 7:
                int i11 = objectInput.readInt();
                byte b15 = objectInput.readByte();
                byte b16 = objectInput.readByte();
                b0.f5378c.getClass();
                objOf = new d0(j$.time.f.P(i11 + 1911, b15, b16));
                break;
            case 8:
                int i12 = objectInput.readInt();
                byte b17 = objectInput.readByte();
                byte b18 = objectInput.readByte();
                h0.f5393c.getClass();
                objOf = new j0(j$.time.f.P(i12 - 543, b17, b18));
                break;
            case 9:
                int i13 = h.e;
                objOf = new h(m.of(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f5385b = objOf;
    }

    private Object readResolve() {
        return this.f5385b;
    }
}
